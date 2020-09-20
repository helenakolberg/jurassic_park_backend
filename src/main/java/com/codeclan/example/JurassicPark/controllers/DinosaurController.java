package com.codeclan.example.JurassicPark.controllers;

import com.codeclan.example.JurassicPark.models.Dinosaur;
import com.codeclan.example.JurassicPark.repositories.DinosaurRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.Principal;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DinosaurController {

    private final Logger log = LoggerFactory.getLogger(DinosaurController.class);
    private DinosaurRepository dinosaurRepository;

    public DinosaurController(DinosaurRepository dinosaurRepository) {
        this.dinosaurRepository = dinosaurRepository;
    }

//    @GetMapping("/dinosaur")
//    Dinosaur dinosaur(Principal principal) {
//        return dinosaurRepository.findByUserId(principal.getName());
//    }

    @GetMapping("/dinosaur")
    Collection<Dinosaur> dinosaur() {
        return dinosaurRepository.findAll();
    }

    @PutMapping("/dinosaur")
    ResponseEntity<Dinosaur> updateDinosaur(@Valid @RequestBody Dinosaur dinosaur) {
        log.info("Request to update dinosaur: {}", dinosaur);
        Dinosaur result = dinosaurRepository.save(dinosaur);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/dinosaur")
    public ResponseEntity<?> deleteDinosaur() {
        log.info("Request to delete dinosaur");
        dinosaurRepository.deleteAll();
        return ResponseEntity.ok().build();
    }

}
