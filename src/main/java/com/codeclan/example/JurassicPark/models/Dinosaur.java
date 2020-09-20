package com.codeclan.example.JurassicPark.models;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity

@Table(name = "user_dinosaur")
public class Dinosaur {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull

    private String name;
    private String photo;
    private boolean happiness;
    private boolean fullness;
    private boolean health;

    @OneToOne(cascade = CascadeType.PERSIST)
    private User user;


}
