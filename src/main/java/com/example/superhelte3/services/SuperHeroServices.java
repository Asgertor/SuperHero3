package com.example.superhelte3.services;

import com.example.superhelte3.SuperHelte3Application;
import com.example.superhelte3.model.SuperHero;
import com.example.superhelte3.repositories.SuperHeroRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SuperHeroServices {
    SuperHeroRepository shRepository = new SuperHeroRepository();
    public ArrayList<SuperHero> getHeroDatabase() {
        return shRepository.getHeroDatabase();
    }
    public SuperHero getSuperHero(String superHeroName){
        return shRepository.getSuperHero(superHeroName);
    }
    public void deleteSuperHero(String superHeroName){
        shRepository.deleteSuperHero(superHeroName);
    }

    public void createSuperHero(SuperHero s) {
        shRepository.createSuperHero(s);
    }
    public void editSuperHero(SuperHero s) {
        shRepository.editSuperHero(s);
    }
}
