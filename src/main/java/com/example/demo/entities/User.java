package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name ="password")
    private String password;

    @OneToMany(mappedBy = "user")
    @Builder.Default
//    user is data member name of address class
    private List<Address> addresses = new ArrayList<>();

    public void addAddress(Address address){
        this.addresses.add(address);
        address.setUser(this);
    }


}
