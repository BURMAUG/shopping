package com.burmau.shop.bread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/v2/bread")
public class BreadController {
    private final BreadService breadService;
    private static final Logger logger = Logger.getLogger(String.valueOf(BreadController.class));

    @Autowired
    BreadController(BreadService breadService) {
        this.breadService = breadService;
    }

    @GetMapping("/")
    Iterable<Bread> getAllBread(){
        logger.info("||Just Entered find all Bread =====>");
        return breadService.findAllBread();
    }
    @GetMapping("/id={id}")
    Optional<Bread> findDrink(@PathVariable Long id){
        return breadService.findById(id);
    }
    @GetMapping("/brand={name}")
    Iterable<Bread> findDrinkByBrand(@PathVariable String name){
        return breadService.findByBrand(name);
    }
    @PostMapping("/")
    void addADrink(Bread bread){
        breadService.addBread(bread);
    }
    @PutMapping("/id={id}")
    Bread updateDrink(@PathVariable Long id, @RequestBody Bread bread){
        return breadService.update(id, bread);
    }
    @DeleteMapping("/id={id}")
    void deleteDrinkWithID(@PathVariable Long id){
        breadService.deleteBreadWithID(id);
    }

}
