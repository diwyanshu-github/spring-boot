package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public void removeAddress(Address address){
        this.addresses.remove(address);
        address.setUser(null);
    }

    @ManyToMany
    @JoinTable(
            name = "user_tags",
            joinColumns = @JoinColumn(name = "user_id"),
           inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    @Builder.Default
    private Set<Tag> tags = new HashSet<>();

    public void addTag(String tag_name){
        var tag = new Tag(tag_name);
        tags.add(tag);
        tag.getUsers().add(this);
    }

    public void removeTag(String tagName){
        tags.removeIf(tag -> {
            if (tag.getName().equals(tagName)) {
                tag.getUsers().remove(this); // maintain both sides
                return true; // remove this tag
            }
            return false; // keep tag
        });
    }

    @OneToOne(mappedBy = "user")
    private Profile profile;

    public void addProfile(Profile profile){
        this.profile = profile;
        profile.setUser(this);
    }

}
