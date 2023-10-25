package com.burmau.shop.milk;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MilkService {
    private final MilkRepository milkRepository;
    public Iterable<Milk> findAllMilk() {
        return milkRepository.find();
    }

    public Optional<Milk> findById(Long id) {
        return milkRepository.findID(id);
    }

    public Iterable<Milk> findByBrand(String name) {
        return milkRepository.findBrand(name);
    }

    public void addMilk(Milk milk) {
        milkRepository.save(milk);
    }

    public void update(Long id, Milk milk) {
        if (!milkRepository.existsById(id))
            throw new MilkNotFoundException("Not Found");
        milkRepository.findID(id).ifPresent(milkdb -> {
            milkdb.setBrand(milk.getBrand());
            milkdb.setPrice(milk.getPrice());
            milkRepository.save(milk);
        });
    }

    public void deleteMilkWithID(Long id) {
        milkRepository.deleteID(id);
    }
}
