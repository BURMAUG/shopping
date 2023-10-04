package com.burmau.shop.strawberry;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StrawberryService {
    private final StrawberryRepository strawberryRepository;
    public Iterable<Strawberry> findAllStrawberry() {
        return strawberryRepository.find();
    }

    public Optional<Strawberry> findById(Long id) {
        return strawberryRepository.findID(id);
    }

    public void addStrawberry(Strawberry strawberry) {
        strawberryRepository.save(strawberry);
    }

//    public Strawberry update(Long id, Strawberry strawberry) {
//        return null;
//    }

    public void deleteStrawberryWithID(Long id) {
        strawberryRepository.deleteID(id);
    }
}
