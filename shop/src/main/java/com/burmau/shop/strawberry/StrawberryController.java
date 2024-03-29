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

    final StrawberryService strawberryService;
    @GetMapping("/")
    Iterable<Strawberry> getAllStrawberry(){
        return strawberryService.findAllStrawberry();
    }
    @GetMapping("/id={id}")
    Optional<Strawberry> findStrawberry(@PathVariable Long id){
        return strawberryService.findById(id);
    }
    @PostMapping("/")
    void addAStrawberry(Strawberry strawberry){
        strawberryService.addStrawberry(strawberry);
    }
    @PutMapping("id=/{id}")
    void updateStrawberry(@PathVariable Long id, @RequestBody Strawberry strawberry){
        strawberryService.update(id, strawberry);
    }
    @DeleteMapping("/id={id}")
    void deleteStrawberryWithID(@PathVariable Long id){
        strawberryService.deleteStrawberryWithID(id);
    }
}
