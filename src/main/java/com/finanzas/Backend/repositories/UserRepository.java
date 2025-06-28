package com.finanzas.Backend.repositories;

import com.finanzas.Backend.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByName(String name);
    User findByLastName(String lastName);
    User findByLastNameAndId(String lastName, String id);
    User findByEmail(String email);
    User findByEmailAndId(String email, String id);

}
