package com.example.superhelte3.repositories;
import com.example.superhelte3.model.SuperHero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Objects;

@Repository
public class SuperHeroRepository {
    ArrayList<SuperHero> superheroDatabase;

    public SuperHeroRepository() {
        this.superheroDatabase = new ArrayList<>();
        superheroDatabase.add(new SuperHero("Clark Kent", "Superman", "Flight and super strength", 1938));
        superheroDatabase.add(new SuperHero("Bruce Wayne", "Batman", "Martial arts and gadgets", 1939));
        superheroDatabase.add(new SuperHero("Diana Prince", "Wonder Woman", "Superhuman strength and agility", 1941));
        superheroDatabase.add(new SuperHero("Peter Parker", "Spider-Man", "Wall-crawling and spider-sense", 1962));
        superheroDatabase.add(new SuperHero("Tony Stark", "Iron Man", "High-tech suit and genius intellect", 1963));
        superheroDatabase.add(new SuperHero("Steve Rogers", "Captain America", "Superhuman strength and agility", 1941));
        superheroDatabase.add(new SuperHero("Natasha Romanoff", "Black Widow", "Martial arts and espionage", 1964));
        superheroDatabase.add(new SuperHero("T'Challa", "Black Panther", "Superhuman strength and agility", 1966));
        superheroDatabase.add(new SuperHero("Carol Danvers", "Captain Marvel", "Energy projection and flight", 1967));
        superheroDatabase.add(new SuperHero("Bruce Banner", "The Hulk", "Superhuman strength and regeneration", 1962));
    }

    public ArrayList<SuperHero> getHeroDatabase() {
        return superheroDatabase;
    }
    public SuperHero getSuperHero(String superHeroName) {
        SuperHero tempHero = null;
        for (SuperHero s : superheroDatabase) {
            if (s.getSuperheroName().equals(superHeroName))
                tempHero = s;
        }
        return tempHero;
    }
}
/*
    //Samler en gruppe af helte, når man skal gemme resultater. Bruges til når der skal redigeres.
    public ArrayList<SuperHero> searchForHeroList(String searchName) {
        SuperHero hero;
        findSuperheroList.clear(); //Clear for at når man søger flere gange så gemmes de gamle svar ikke

        for (int n = 0; n < superheroDatabase.size(); n++) {
            hero = superheroDatabase.get(n);
            if (hero.getName().toLowerCase().contains(searchName.toLowerCase())) {
                findSuperheroList.add(hero);

            } else if (hero.getSuperheroName() != null && hero.getSuperheroName().contains(searchName.toLowerCase())) {
                findSuperheroList.add(hero);
            }
        }
        return findSuperheroList;
    }

    public void deleteHero(int heroToDelete) {

        //Fjerner 1 fra bruger input for at matche arraylist index
        int deleteOnIndex = heroToDelete - 1;

        //Printer ud før der slettes så man stadig kan hente den slettede helts navn.
        System.out.println(superheroDatabase.get(deleteOnIndex).getName() + " has been deleted");

        superheroDatabase.remove(deleteOnIndex);
    }

 */
