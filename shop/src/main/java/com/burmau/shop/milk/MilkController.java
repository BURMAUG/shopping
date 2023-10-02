package com.burmau.shop.milk;

import com.burmau.shop.bread.Bread;
import com.burmau.shop.bread.BreadService;
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
    Iterable<Bread> getAllMilk(){
        return milkService.findAllMilk();
    }
    @GetMapping("/id={id}")
    Optional<Bread> findMilk(@PathVariable Long id){
        return milkService.findById(id);
    }
    @GetMapping("/brand={name}")
    Iterable<Bread> findMilkByBrand(@PathVariable String name){
        return milkService.findByBrand(name);
    }
    @PostMapping("/")
    void addAMilk(Milk milk){
        milkService.addMilk(milk);
    }
    @PutMapping("id=/{id}")
    Milk updateMilk(@PathVariable Long id, @RequestBody Milk milk){
        return milkService.update(id, milk);
    }
    @DeleteMapping("/id={id}")
    void deleteMilkWithID(@PathVariable Long id){
        milkService.deleteMilkWithID(id);
    }


}
