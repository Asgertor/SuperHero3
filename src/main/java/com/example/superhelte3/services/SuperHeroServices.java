package com.example.superhelte3.services;

import com.example.superhelte3.model.SuperHero;
import com.example.superhelte3.repositories.SuperHeroRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SuperHeroServices {
    SuperHeroRepository superHeroRepository = new SuperHeroRepository();
    public ArrayList<SuperHero> getHeroDatabase() {
        return superHeroRepository.getHeroDatabase();
    }
    public SuperHero getSuperHero(String superHeroName){
        return superHeroRepository.getSuperHero(superHeroName);
    }
    public void deleteSuperHero(String superHeroName){
        superHeroRepository.deleteSuperHero(superHeroName);
    }

    public void createSuperHero(SuperHero s) {
        superHeroRepository.createSuperHero(s);
    }
    public void editSuperHero(SuperHero s) {
        superHeroRepository.editSuperHero(s);
    }
}
