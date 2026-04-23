package com.wildpack.wildpack.controller;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wildpack.wildpack.model.Animal;
import com.wildpack.wildpack.repository.AnimalRepository;

@RestController
@RequestMapping("/api/animals")
@CrossOrigin(origins = "*")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Animal> getAnimalById(@PathVariable Long id) {
        return animalRepository.findById(id);
    }

    @GetMapping("/search")
    public List<Animal> searchAnimals(@RequestParam String name) {
        return animalRepository.findByNameContainingIgnoreCase(name);
    }

    @GetMapping("/status/{status}")
    public List<Animal> getByStatus(@PathVariable String status) {
        return animalRepository.findByStatus(status);
    }

    @GetMapping("/random-fact")
    public String getRandomFunFact() {
        List<Animal> animals = animalRepository.findAll();
        if (animals.isEmpty()) return "No fun facts yet!";
        Animal random = animals.get(new Random().nextInt(animals.size()));
        return random.getName() + ": " + random.getFunFact();
    }
}
