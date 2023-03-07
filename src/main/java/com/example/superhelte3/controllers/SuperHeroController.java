package com.example.superhelte3.controllers;

import com.example.superhelte3.model.SuperHero;
import com.example.superhelte3.services.SuperHeroServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(path = "Superhero")

@Controller
public class SuperHeroController {
    SuperHeroServices superHeroServices = new SuperHeroServices();

    @GetMapping(path = "/")
    public ResponseEntity<List<SuperHero>> showAllHeroes() {
        ArrayList<SuperHero> heroList = superHeroServices.getHeroDatabase();
        return new ResponseEntity<>(heroList, HttpStatus.OK);
    }

    @GetMapping(path="{superHeroName}")
    public ResponseEntity<SuperHero> showSpecificHero(@PathVariable String superHeroName) {
        SuperHero s = superHeroServices.getSuperHero(superHeroName);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @GetMapping("delete")
    public ResponseEntity<Void> deleteSuperHero(@RequestParam String superHeroName) {
        superHeroServices.deleteSuperHero(superHeroName);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(path="create")
    public ResponseEntity<SuperHero> createSuperHero(@RequestBody SuperHero s){
        superHeroServices.createSuperHero(s);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @PutMapping(path="edit")
    public ResponseEntity<SuperHero> editSuperHero(@RequestBody SuperHero s){
        superHeroServices.editSuperHero(s);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }









}
