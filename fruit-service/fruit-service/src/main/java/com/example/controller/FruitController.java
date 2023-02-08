package com.example.controller;
import java.util.List;

import com.example.domain.Fruit;
import com.example.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FruitController {

    @Autowired
    FruitRepository repository;


    @GetMapping("fruits")
    public List<Fruit> getAllFruits(){
        return repository.findAll();

    }


    @GetMapping("fruits/{id}")
    public Fruit getFruit(@PathVariable Long id){
        return repository.findById(id).get();

    }

    @PostMapping("fruits")
    public void saveFruit(@RequestBody  Fruit fruit) {
        repository.save(fruit);

    }

    @DeleteMapping("fruits/{id}")
    public void deleteFruit(@PathVariable Long id){
        repository.deleteById(id);

    }

    @PutMapping("fruits")
    public void updateFruit(@RequestBody  Fruit newFruit) {
        repository.save(newFruit);

    }
}


