package com.turnon.safety.SafetyApi.service;

import com.turnon.safety.SafetyApi.entity.NewUser;
import com.turnon.safety.SafetyApi.entity.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUser(NewUser user) {
        repository.save(user);
    }
}
