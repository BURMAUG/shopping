package com.burmau.shop;

import com.burmau.shop.controller.FruitController;
import com.burmau.shop.model.fruit.Pepper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FruitController.class)
@SpringBootTest
class ShopApplicationTests {

	@Autowired
	MockMvc mockMvc;
	List<Pepper>pepperList = new ArrayList<>();
	@BeforeEach
	void setUp(){
		pepperList = List.of(
			new Pepper(2334, "Red and succulent"),
				new Pepper(234, "Yellow bell pepper"),
				new Pepper(334, "Red Bell Pepper"),
				new Pepper(233, "Small Jallapino Peppper"),
				new Pepper(34, "Hot habanero Pepper")
		);
	}
	@Test
	void contextLoads() throws Exception {
		mockMvc.perform(get("/api.fruit/pepper"))
				.andExpect(status().isOk());
	}

}
