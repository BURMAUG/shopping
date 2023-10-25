package com.burmau.shop.bread;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
class BreadService {
    final BreadRepository breadRepository;

     Iterable<Bread> findAllBread() {
        return breadRepository.find();
    }

     Optional<Bread> findById(Long id) {
        if(breadRepository.existsById(id))
            return breadRepository.findID(id);
        throw new BreadNotFoundException("Bread Not Found!");
    }

     Iterable<Bread> findByBrand(String name) {
        if(breadRepository.existsByBrand(name))
            return breadRepository.findBrand(name);
        throw new BreadNotFoundException("Bread Not Found");
    }

     void addBread(Bread bread) {
       breadRepository.save(bread);
    }

     void update(Long id, Bread bread) {
        if (!breadRepository.existsById(id))
            throw new BreadNotFoundException("Not Found.");
        breadRepository.findID(id).ifPresent(dbBread -> {
            bread.setBrand(dbBread.getBrand());
            bread.setSliced(dbBread.getSliced());
            breadRepository.save(dbBread);
        });

    }

     void deleteBreadWithID(Long id) {
        breadRepository.deleteById(id);
    }
}
