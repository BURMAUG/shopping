package com.burmau.shop.bread;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BreadService {
    private final BreadRepository breadRepository;

    public Iterable<Bread> findAllBread() {
        return breadRepository.find();
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

    public Bread update(Long id, Bread bread) {
        return null;
    }

    public void deleteBreadWithID(Long id) {
        breadRepository.deleteById(id);
    }
}
