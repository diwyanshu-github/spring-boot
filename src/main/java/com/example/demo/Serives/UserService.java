package com.example.demo.Serives;

import com.example.demo.entities.Address;
import com.example.demo.entities.User;
import com.example.demo.repositories.AddressRepository;
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
    private final AddressRepository addressRepository;
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

//    @Transactional
    public void fetchAddress(){
        var address = addressRepository.findById(2L).orElseThrow();
        System.out.println(address.getUser().getEmail());
    }


    public void persistRelatedEntities(){
        var user = User.builder().name("name-abc").email("xyz@xyz.com").password("abc").build();
        var address = Address.builder().street("street name").zip("some-zip").city("some city").state("some state").build();

        user.addAddress(address);
        userRepository.save(user);
    }

    @Transactional
    public void deleteRelatedEntities(){
//        userRepository.deleteById(13L);
        var user = userRepository.findById(16L).orElseThrow();
        var address = user.getAddresses().getFirst();
        user.removeAddress(address);
        userRepository.save(user);
    }


}
