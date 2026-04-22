package com.Joseph.WildPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class AnimalService {

    @Autowired 
    private AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Optional<Animal> getAnimalById(Long id) {
        return animalRepository.findById(id);
    }

    public List<Animal> getAnimalsByStatus(AnimalStatus status) {
        return animalRepository.findByStatus(status);
    }

    public List<Animal> searchAnimals(String keyword) {



        return animalRepository.findByNameContainingIgnoreCase(keyword);
    }

    public String getRandomFunFact() {
        List<Animal> animals = animalRepository.findAll();
        if (animals.isEmpty()) return "No fun facts yet!";
        Animal random = animals.get(new Random().nextInt(animals.size()));
        return random.getName() + ": " + random.getFunFact();
    }



    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);

    }



    public void deleteAnimal(Long id) {
        animalRepository.deleteById(id);
    }
    



}
