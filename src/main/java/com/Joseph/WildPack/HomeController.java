package com.Joseph.WildPack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller; // Ensure this import is here!
import org.springframework.ui.Model;  // Ensure this import is here!
import org.springframework.web.bind.annotation.GetMapping; // Ensure this import is here!
@Controller
public class HomeController { 

    @GetMapping("/")
public String home(Model model) {
    List<Animal> speciesList = new ArrayList<>();
    
  speciesList.add(new Animal("Gray Wolf", "Canis lupus", "Apex pack hunters.", "Forests", "https://placehold.co/600x400/222/c8a96e?text=Gray+Wolf"));
speciesList.add(new Animal("Bald Eagle", "Haliaeetus leucocephalus", "Master of the skies.", "Mountains", "https://placehold.co/600x400/222/c8a96e?text=Bald+Eagle"));
speciesList.add(new Animal("Snow Leopard", "Panthera uncia", "Ghost of the Himalayas.", "Himalayas", "https://placehold.co/600x400/222/c8a96e?text=Snow+Leopard"));
    model.addAttribute("animals", speciesList);
    model.addAttribute("featuredAnimal", speciesList.get(0));

    return "index";
}
} //lofi