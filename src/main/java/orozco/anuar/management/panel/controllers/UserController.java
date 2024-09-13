package orozco.anuar.management.panel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import orozco.anuar.management.panel.models.User;
import orozco.anuar.management.panel.repositories.UserRepository;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/users")
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @DeleteMapping("/api/users/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }

    @PostMapping("/api/users")
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

}
