package com.Joseph.WildPack;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> findByStatus(AnimalStatus status);
    List<Animal> findByNameContainingIgnoreCase(String name);
    List<Animal> findByContinent(String continent);
}
