package com.example.demo.entities;

import jakarta.persistence.*;
import jdk.jfr.Unsigned;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "profiles")
public class Profile {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column( name = "bio")
    private String bio;
    
    @Column( name = "phone_number")
    private String phoneNumber;
    
    @Column( name = "date_of_birth")
    private LocalDate dateOfBirth;
    
    @Column( name = "loyalty_points")
    private Integer loyaltyPoints;

    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    @ToString.Exclude
    private User user;
}
