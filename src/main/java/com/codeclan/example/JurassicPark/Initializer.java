package com.codeclan.example.JurassicPark;

import com.codeclan.example.JurassicPark.models.Dinosaur;
import com.codeclan.example.JurassicPark.repositories.DinosaurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

@Component
public class Initializer implements ApplicationRunner {

    @Autowired
    DinosaurRepository dinosaurRepository;

    public Initializer() {}

    public void run(ApplicationArguments args) {

        Dinosaur tRex = new Dinosaur("Tyrannosaurus Rex", "https://www.pinclipart.com/picdir/big/409-4092141_jurassic-world-high-quality-transparent-background-dinosaur-png.png", true, true, true);
        dinosaurRepository.save(tRex);

    }

}
