package com.writetrack.web;

import com.writetrack.dao.MongoUserRepository;
import com.writetrack.domain.Status;
import com.writetrack.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private MongoUserRepository repository;

    @RequestMapping(
            value = "/all",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Status deleteAll() {
        repository.deleteAll();

        return Status.SUCCESS;
    }

    @RequestMapping(
            value = "/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAll() {
        List<User> retVal = new ArrayList<>();
        for (User user : repository.findAll()) {
            retVal.add(user);
        }

        return retVal;
    }

    @RequestMapping(
            value = "",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User createUser(@RequestBody User user) {
        repository.save(user);

        return user;
    }
}
