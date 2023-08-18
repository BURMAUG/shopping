package com.burmau.shop.service.impl;

import com.burmau.shop.model.fruit.Fruit;
import com.burmau.shop.model.fruit.Pepper;
import com.burmau.shop.model.fruit.Strawberry;
import com.burmau.shop.model.fruit.Tomato;
import com.burmau.shop.repository.PepperRepository;
import com.burmau.shop.repository.StrawberryRepository;
import com.burmau.shop.repository.TomatoRepository;
import com.burmau.shop.service.FruitService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;

@Service
@AllArgsConstructor
public class FruitServiceImpl implements FruitService {
    private final PepperRepository pepperRepository;
    private final StrawberryRepository strawberryRepository;
    private final TomatoRepository tomatoRepository;
    @Override
    public Iterable<Fruit> findAllFruit() {
        return all();
    }
    private Iterable<Fruit> all(){
        Iterator<Pepper> pepperiterator = pepperRepository.findAll().iterator();
        Iterator<Strawberry> strawberryIterator = strawberryRepository.findAll().iterator();
        Iterator<Tomato> tomatoIterator = tomatoRepository.findAll().iterator();
        ArrayList<Fruit> fruits = new ArrayList<>();

        while (pepperiterator.hasNext())
            fruits.add(pepperiterator.next());
        while (strawberryIterator.hasNext())
            fruits.add(strawberryIterator.next());
        while (tomatoIterator.hasNext())
            fruits.add(tomatoIterator.next());
        return fruits;
    }
}
