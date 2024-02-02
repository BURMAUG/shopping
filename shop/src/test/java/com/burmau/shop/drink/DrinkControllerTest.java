package com.burmau.shop.drink;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureWebMvc
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
class DrinkControllerTest {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    DrinkRepository drinkRepository;

    List<Drink> drinkList = new ArrayList<>();
    @BeforeEach
    void setUp() {
        drinkList = new ArrayList<>(List.of(
                new Drink(1L, "Butter Milk", "Kroger", new BigDecimal("8.2")),
                new Drink(2L, "12 Eggs", "Kroger", new BigDecimal("5.2"))
        ));
        drinkRepository.saveAll(drinkList);
    }

    @Test
    void getAllDrinks() throws Exception {
        String json =
                """
                    [
                        {
                            "drinkID" :  1,
                            "brand": "Butter Milk",
                            "manufacturer": "Kroger",
                            "price": 8.2
                        },
                        {
                            "drinkID" :  2,
                            "brand": "12 Eggs",
                            "manufacturer": "Kroger",
                            "price": 5.2
                            
                        }
                    ]
                """;
        when(drinkRepository.findAll()).thenReturn(drinkList);
        mockMvc.perform(get("/api/v2/drink"))
                .andExpect(status().isOk())
                .andExpect(content().json(json));
    }

    // make test for id 1
   @Test
   void shouldPassTestForValidDrinkID() throws Exception {
        System.out.println(drinkRepository.findById(1L));
        when(drinkRepository.findAll()).thenReturn(drinkList);
        mockMvc.perform(get("/api/v2/drink/id={id}", 1))
                .andExpect(status().isOk());
   }

    // make test for outlandish id 1000
    @Test
    void shouldFailTestForInvalidDrinkID(){

    }
    @Test
    void findDrink() {
    }

    @Test
    void findDrinkByBrand() {
    }

    @Test
    void findDrinkBy() {
    }

    @Test
    void addADrink() {
    }

    @Test
    void updateDrink() {
    }

    @Test
    void deleteDrinkWithID() {
    }
}