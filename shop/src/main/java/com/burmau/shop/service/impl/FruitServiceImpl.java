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

    @Override
    public Iterable<Pepper> findAllPepper() {
        Iterator<Pepper> pepperiterator = pepperRepository.findAll().iterator();
        ArrayList<Pepper> peppers = new ArrayList<>();
        while (pepperiterator.hasNext())
            peppers.add(pepperiterator.next());
        return peppers;
    }

    @Override
    public Iterable<Strawberry> findAllStrawberry() {
        Iterator<Strawberry> strawberryIterator = strawberryRepository.findAll().iterator();
        ArrayList<Strawberry> strawberries = new ArrayList<>();
        while (strawberryIterator.hasNext())
            strawberries.add(strawberryIterator.next());
        return strawberries;
    }

    @Override
    public Iterable<Tomato> findAllTomato() {
        Iterator<Tomato> tomatoIterator = tomatoRepository.findAll().iterator();
        ArrayList<Tomato> tomatoes = new ArrayList<>();
        while (tomatoIterator.hasNext())
            tomatoes.add(tomatoIterator.next());
        return tomatoes;
    }

    @Override
    public void saveNewPepper(Pepper pepper) {
        //what if the pepper is null I should have a check for that.
        pepperRepository.saveNewPepper(pepper.getPrice(), pepper.getDescription());
    }


    @Override
    public void saveNewStrawberry(Strawberry strawberry) {
        strawberryRepository.save(strawberry);
    }

    @Override
    public void saveNewTomato(Tomato tomato) {
        tomatoRepository.save(tomato);
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
