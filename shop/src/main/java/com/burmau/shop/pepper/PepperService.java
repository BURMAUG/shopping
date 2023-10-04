package com.burmau.shop.pepper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
class PepperService {
    private final PepperRepository pepperRepository;
    public Iterable<Pepper> findAllPepper() {
        return pepperRepository.find();
    }
    public Optional<Pepper> findById(Long id) {
        return pepperRepository.findID(id);
    }
    public void addPepper(Pepper pepper) {
        pepperRepository.save(pepper);
    }
//    public Pepper update(Long id, Pepper pepper) {
//        return pepperRepository.updatePepper(pepper);
//    }
    public void deletePepperWithID(Long id) {
        pepperRepository.deleteID(id);
    }
}
