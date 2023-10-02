package com.burmau.shop.rice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/api/v2/rice")
@AllArgsConstructor
public class RiceController {

    private final RiceService riceService;
    @GetMapping("/")
    Iterable<Rice> getAllRice(){
        return riceService.findAllRice();
    }
    @GetMapping("/id={id}")
    Optional<Rice> findRice(@PathVariable Long id){
        return riceService.findById(id);
    }
    @GetMapping("/brand={name}")
    Iterable<Rice> findRiceByBrand(@PathVariable String name){
        return riceService.findByBrand(name);
    }
    @PostMapping("/")
    void addARice(Rice rice){
        riceService.addRice(rice);
    }
    @PutMapping("id=/{id}")
    Rice updateRice(@PathVariable Long id, @RequestBody Rice rice){
        return riceService.update(id, rice);
    }
    @DeleteMapping("/id={id}")
    void deleteRiceWithID(@PathVariable Long id){
        riceService.deleteRiceWithID(id);
    }
}
