package com.burmau.shop.pepper;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/pepper")
@AllArgsConstructor
class PepperController {

    private final PepperService pepperService;
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
//    @PutMapping("id=/{id}")
//    Pepper updatePepper(@PathVariable Long id, @RequestBody Pepper pepper){
//        return pepperService.update(id, pepper);
//    }
    @DeleteMapping("/id={id}")
    void deletePepperWithID(@PathVariable Long id){
        pepperService.deletePepperWithID(id);
    }

}
