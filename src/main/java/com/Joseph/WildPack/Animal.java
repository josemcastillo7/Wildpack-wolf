package com.Joseph.WildPack;

public class Animal {
    public String name;
    public String species;
    public String description;
    public String habitat;
    public String imageUrl;

    public Animal(String name, String species, String description, String habitat, String imageUrl) {
        this.name = name;
        this.species = species;
        this.description = description;
        this.habitat = habitat;
        this.imageUrl = imageUrl;
    }

    // Standard Getters
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public String getDescription() { return description; }
    public String getHabitat() { return habitat; }
    public String getImageUrl() { return imageUrl; }
}