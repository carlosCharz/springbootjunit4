package com.wedevol.springbootjunit4.core.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wedevol.springbootjunit4.core.dao.UserRepository;
import com.wedevol.springbootjunit4.core.entity.UserEntity;
import com.wedevol.springbootjunit4.core.service.UserService;

/**
 * Service that manages the valid operations over the user.
 *
 * @author Charz++
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserEntity findByIdOrThrow(String id) {
        Optional<UserEntity> userObj = Optional.ofNullable(userRepo.findById(id));
        return userObj.orElseThrow(RuntimeException::new);
    }

    @Override
    public UserEntity create(UserEntity userInput) {
        // We first search by email, the user should not exist
        Optional<UserEntity> userObj = Optional.ofNullable(findByEmail(userInput.getEmail()));
        if (userObj.isPresent()) {
            throw new RuntimeException();
        }
        return userRepo.create(userInput);
    }

    @Override
    public void update(String id, UserEntity userInput) {
        UserEntity userDb = findByIdOrThrow(id);
        if (userInput.getName() != null) {
            userDb.setName(userInput.getName());
        }
        if (userInput.getEmail() != null) {
            userDb.setEmail(userInput.getEmail());
        }
        if (userInput.getAge() != null) {
            userDb.setAge(userInput.getAge());
        }
        userRepo.update(id, userInput);
    }

    @Override
    public void delete(String id) {
        findByIdOrThrow(id);
        userRepo.delete(id);
    }

    @Override
    public Boolean exists(String id) {
        return userRepo.exists(id);
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public Integer countAll() {
        return userRepo.countAll();
    }

}
