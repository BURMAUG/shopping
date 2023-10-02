package com.burmau.shop.milk;

import com.burmau.shop.bread.Bread;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MilkService {
    private final MilkRepository milkRepository;
    public Iterable<Bread> findAllMilk() {
        return milkRepository.find();
    }

    public Optional<Bread> findById(Long id) {
        return milkRepository.findID(id);
    }

    public Iterable<Bread> findByBrand(String name) {
        return milkRepository.findBrand(name);
    }

    public void addMilk(Milk milk) {
        milkRepository.save(milk);
    }

    public Milk update(Long id, Milk milk) {
        return milkRepository.save(milk);
    }

    public void deleteMilkWithID(Long id) {
        milkRepository.deleteID(id);
    }
}
