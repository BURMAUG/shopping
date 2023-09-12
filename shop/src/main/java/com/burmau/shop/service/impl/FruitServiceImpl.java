package com.burmau.shop.service.impl;

import com.burmau.shop.model.fruit.AbstractFruit;
import com.burmau.shop.model.fruit.Pepper;
import com.burmau.shop.model.fruit.Strawberry;
import com.burmau.shop.model.fruit.Tomato;
import com.burmau.shop.repository.fruit.PepperRepository;
import com.burmau.shop.repository.fruit.StrawberryRepository;
import com.burmau.shop.repository.fruit.TomatoRepository;
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
    public Iterable<AbstractFruit> findAllFruit() {
        return all();
    }

    @Override
    public Iterable<Pepper> findAllPepper() {
        Iterator<Pepper> pepperIterator = pepperRepository.findAll().iterator();
        ArrayList<Pepper> peppers = new ArrayList<>();
        while (pepperIterator.hasNext())
            peppers.add(pepperIterator.next());
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
        pepperRepository.save(pepper);
    }


    @Override
    public void saveNewStrawberry(Strawberry strawberry) {
        strawberryRepository.save(strawberry);
    }

    @Override
    public void saveNewTomato(Tomato tomato) {
        tomatoRepository.save(tomato);
    }

    @Override
    public Iterable<Pepper> deleteBy(Long id) {
        pepperRepository.deleteById(id);
        return pepperRepository.findAll();
    }

    @Override
    public Iterable<Strawberry> deleteStrawberryBy(Long id) {
        strawberryRepository.deleteById(id);
        return strawberryRepository.findAll();
    }

    @Override
    public Iterable<Tomato> deleteTomatoBy(Long id) {
        tomatoRepository.deleteById(id);
        return tomatoRepository.findAll();
    }

    private Iterable<AbstractFruit> all(){
        Iterator<Pepper> pepperIterator = pepperRepository.findAll().iterator();
        Iterator<Strawberry> strawberryIterator = strawberryRepository.findAll().iterator();
        Iterator<Tomato> tomatoIterator = tomatoRepository.findAll().iterator();
        ArrayList<AbstractFruit> abstractFruits = new ArrayList<>();

        while (pepperIterator.hasNext())
            abstractFruits.add(pepperIterator.next());
        while (strawberryIterator.hasNext())
            abstractFruits.add(strawberryIterator.next());
        while (tomatoIterator.hasNext())
            abstractFruits.add(tomatoIterator.next());
        return abstractFruits;
    }
}
