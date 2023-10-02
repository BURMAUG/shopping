package com.burmau.shop.strawberry;

import com.burmau.shop.strawberry.Strawberry;
import com.burmau.shop.strawberry.StrawberryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/strawberry")
@AllArgsConstructor
class StrawberryController {

    private final StrawberryService strawberryService;
    @GetMapping("/")
    Iterable<Strawberry> getAllStrawberry(){
        return strawberryService.findAllStrawberry();
    }
    @GetMapping("/id={id}")
    Optional<Strawberry> findStrawberry(@PathVariable Long id){
        return strawberryService.findById(id);
    }
    @GetMapping("/brand={name}")
    Iterable<Strawberry> findStrawberryByBrand(@PathVariable String name){
        return strawberryService.findByBrand(name);
    }
    @PostMapping("/")
    void addAStrawberry(Strawberry strawberry){
        strawberryService.addStrawberry(strawberry);
    }
    @PutMapping("id=/{id}")
    Strawberry updateStrawberry(@PathVariable Long id, @RequestBody Strawberry strawberry){
        return strawberryService.update(id, strawberry);
    }
    @DeleteMapping("/id={id}")
    void deleteStrawberryWithID(@PathVariable Long id){
        strawberryService.deleteStrawberryWithID(id);
    }
}
