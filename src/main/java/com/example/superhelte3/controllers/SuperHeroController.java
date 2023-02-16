package com.example.superhelte3.controllers;

import com.example.superhelte3.model.SuperHero;
import com.example.superhelte3.services.SuperHeroServices;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(path = "Superhero")

@Controller
public class SuperHeroController {
    SuperHeroServices shServices = new SuperHeroServices();


    @GetMapping(path = "/")
    public ResponseEntity<List<SuperHero>> showAllHeroes() {
        ArrayList<SuperHero> heroList = shServices.getHeroDatabase();
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("Content-Type", "text");
        return new ResponseEntity<>(heroList, HttpStatus.OK);
    }

    @GetMapping(path="{superHeroName}")
    public ResponseEntity<SuperHero> showSpecificHero(@PathVariable String superHeroName) {
        SuperHero s = shServices.getSuperHero(superHeroName);
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("Content-Type", "text");
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

}
