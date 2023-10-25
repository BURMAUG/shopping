package com.burmau.shop.milk;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
class MilkService {
    final MilkRepository milkRepository;
    Iterable<Milk> findAllMilk() {
        return milkRepository.find();
    }

    Optional<Milk> findById(Long id) {
        return milkRepository.findID(id);
    }

    Iterable<Milk> findByBrand(String name) {
        return milkRepository.findBrand(name);
    }

    void addMilk(Milk milk) {
        milkRepository.save(milk);
    }

    void update(Long id, Milk milk) {
        if (!milkRepository.existsById(id))
            throw new MilkNotFoundException("Not Found");
        milkRepository.findID(id).ifPresent(milkdb -> {
            milkdb.setBrand(milk.getBrand());
            milkdb.setPrice(milk.getPrice());
            milkRepository.save(milk);
        });
    }

    void deleteMilkWithID(Long id) {
        milkRepository.deleteID(id);
    }
}
