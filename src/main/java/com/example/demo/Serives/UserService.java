package com.example.demo.Serives;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Transactional
public class UserService {
    private final UserRepository userRepository;
    private EntityManager entityManager;

    public void showEntityStates() {

        User user = User.builder().name("abcd").email("x@y.com").password("abc").build();

        if (entityManager.contains(user)) {
            System.out.println("User exists in persistence state");
        } else {
            System.out.println("User does not exist in persistence state");
        }
        userRepository.save(user);

        if (entityManager.contains(user)) {
            System.out.println("User exists in persistence state");
        } else {
            System.out.println("User does not exist in persistence state");
        }
    }
}
