package com.burmau.shop.universal;

import com.burmau.shop.bread.Bread;
import com.burmau.shop.bread.BreadRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
class Services {
    private final BreadRepository breadRepository;
    public Iterable<Bread> get(){
        
        return breadRepository.findAll();
    }
}
