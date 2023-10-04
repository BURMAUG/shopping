package com.burmau.shop.milk;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v2/milk")
public class MilkController {
    private final MilkService milkService;
    @GetMapping("/")
    Iterable<Milk> getAllMilk(){
        return milkService.findAllMilk();
    }
    @GetMapping("/id={id}")
    Optional<Milk> findMilk(@PathVariable Long id){
        return milkService.findById(id);
    }
    @GetMapping("/brand={name}")
    Iterable<Milk> findMilkByBrand(@PathVariable String name){
        return milkService.findByBrand(name);
    }
    @PostMapping("/")
    void addAMilk(Milk milk){
        milkService.addMilk(milk);
    }
    @PutMapping("/id={id}")
    Milk updateMilk(@PathVariable Long id, @RequestBody Milk milk){
        return milkService.update(id, milk);
    }
    @DeleteMapping("/id={id}")
    void deleteMilkWithID(@PathVariable Long id){
        milkService.deleteMilkWithID(id);
    }


}
