package com.burmau.shop.strawberry;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
 class StrawberryService {
    final StrawberryRepository strawberryRepository;
     Iterable<Strawberry> findAllStrawberry() {
        return strawberryRepository.find();
    }

     Optional<Strawberry> findById(Long id) {
        return strawberryRepository.findID(id);
    }

     void addStrawberry(Strawberry strawberry) {
        strawberryRepository.save(strawberry);
    }

     void update(Long id, Strawberry strawberry) {
        if(!strawberryRepository.existsById(id))
            throw new StrawberryNotFoundException("Item not found");
        strawberryRepository.findID(id).ifPresent(dbstrawberry ->{
            dbstrawberry.setBrand(strawberry.getBrand());
            dbstrawberry.setPrice(strawberry.getPrice());
            strawberryRepository.save(dbstrawberry);
        });

    }

     void deleteStrawberryWithID(Long id) {
        strawberryRepository.deleteID(id);
    }
}
