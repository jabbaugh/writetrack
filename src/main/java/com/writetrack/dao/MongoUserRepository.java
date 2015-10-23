package com.writetrack.dao;

import com.writetrack.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoUserRepository extends MongoRepository<User, String> {
    public User findByEmail(String email);
    public List<User> findByLastName(String lastName);
}
