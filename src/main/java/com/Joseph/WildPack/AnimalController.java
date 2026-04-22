package com.Joseph.WildPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/animals")
@CrossOrigin(origins = "*")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping("/{id}")
    public Optional<Animal> getAnimalById(@PathVariable Long id) {
        return animalService.getAnimalById(id);
    }

    @GetMapping("/status/{status}")
    public List<Animal> getByStatus(@PathVariable AnimalStatus status) {
        return animalService.getAnimalsByStatus(status);
    }

    @GetMapping("/search")
    public List<Animal> searchAnimals(@RequestParam String name) {
        return animalService.searchAnimals(name);
    }

    @GetMapping("/funfact")
    public String getRandomFunFact() {
        return animalService.getRandomFunFact();
    }

    @PostMapping
    public Animal saveAnimal(@RequestBody Animal animal) {
        return animalService.saveAnimal(animal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable Long id) {
        animalService.deleteAnimal(id);
    }
}