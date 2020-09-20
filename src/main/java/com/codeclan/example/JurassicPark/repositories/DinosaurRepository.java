package com.codeclan.example.JurassicPark.repositories;

import com.codeclan.example.JurassicPark.models.Dinosaur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DinosaurRepository extends JpaRepository<Dinosaur, Long> {

    Dinosaur findByUserId(String id);
}
