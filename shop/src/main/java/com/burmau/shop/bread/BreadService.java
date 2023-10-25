package com.burmau.shop.bread;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BreadService {
    private final BreadRepository breadRepository;

    public Iterable<Bread> findAllBread() {
        return breadRepository.findAll();
    }

    public Optional<Bread> findById(Long id) {
        if(breadRepository.existsById(id))
            return breadRepository.findID(id);
        throw new BreadNotFoundException("Bread Not Found!");
    }

    public Iterable<Bread> findByBrand(String name) {
        if(breadRepository.existsByBrand(name))
            return breadRepository.findBrand(name);
        throw new BreadNotFoundException("Bread Not Found");
    }

    public void addBread(Bread bread) {
       breadRepository.save(bread);
    }

    public void update(Long id, Bread bread) {
        if (!breadRepository.existsById(id))
            throw new BreadNotFoundException("Not Found.");
        breadRepository.findID(id).ifPresent(dbBread -> {
            bread.setBrand(dbBread.getBrand());
            bread.setSliced(dbBread.getSliced());
            breadRepository.save(dbBread);
        });

    }

    public void deleteBreadWithID(Long id) {
        breadRepository.deleteById(id);
    }
}
