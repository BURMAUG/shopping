package com.burmau.shop.rice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
class RiceService {
    final RiceRepository riceRepository;
    Iterable<Rice> findAllRice() {
        return riceRepository.find();
    }

    Optional<Rice> findById(Long id) {
        return riceRepository.findID(id);
    }

    void addRice(Rice rice) {
        riceRepository.save(rice);
    }

    void update(Long id, Rice rice) {
        if(!riceRepository.existsById(id))
            throw new RiceNotFoundException("Item Not Found.");
        riceRepository.findID(id).ifPresent(dbrice -> {
            dbrice.setDescription(rice.getDescription());
            dbrice.setPrice(rice.getPrice());
            riceRepository.save(dbrice);
        });
    }

    public void deleteRiceWithID(Long id) {
        riceRepository.deleteID(id);
    }
}
