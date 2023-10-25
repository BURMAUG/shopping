package com.burmau.shop.pepper;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/pepper")
@AllArgsConstructor
class PepperController {

    final PepperService pepperService;
    @GetMapping("/")
    Iterable<Pepper> getAllPepper(){
        return pepperService.findAllPepper();
    }
    @GetMapping("/id={id}")
    Optional<Pepper> findPepper(@PathVariable Long id){
        return pepperService.findById(id);
    }
    @PostMapping("/")
    void addAPepper(Pepper pepper){
        pepperService.addPepper(pepper);
    }
    @PutMapping("/id={id}")
    void updatePepper(@PathVariable Long id, String description, BigDecimal price){
         pepperService.update(id, description, price);
    }
    @DeleteMapping("/id={id}")
    void deletePepperWithID(@PathVariable Long id){
        pepperService.deletePepperWithID(id);
    }

}
