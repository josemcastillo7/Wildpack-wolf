package com.wildpack.wildpack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildpack.wildpack.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findByNameContainingIgnoreCase(String name);

    List<Animal> findByStatus(String status);

    List<Animal> findByContinent(String continent);
}