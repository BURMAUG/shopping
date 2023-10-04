package com.burmau.shop.rice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
class RiceService {
    private final RiceRepository riceRepository;
    public Iterable<Rice> findAllRice() {
        return riceRepository.find();
    }

    public Optional<Rice> findById(Long id) {
        return riceRepository.findID(id);
    }

    public void addRice(Rice rice) {
        riceRepository.save(rice);
    }

    public Rice update(Long id, Rice rice) {
        return null;
    }

    public void deleteRiceWithID(Long id) {
        riceRepository.deleteID(id);
    }
}
