package com.registaration2.registration2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.registaration2.registration2.entity.Users;
import com.registaration2.registration2.repository.UsersRepository;

@Service
public class UsersService {

    @Autowired
    UsersRepository repository;

    public Users createUser(Users user)
    {


        Optional<Users> userOptional = repository.findById(user.getID_USER());

        Users newUser= userOptional.get();
        newUser.setFirstName(user.getFirstName());
        newUser.setSecondName(user.getSecondName());
        newUser.setEmail(user.getEmail());
        newUser.setLogin(user.getLogin());
        newUser.setPassword(user.getPassword());
        newUser.setPhone(user.getPhone());
        newUser.setPhoto(user.getPhoto());
        newUser.setID_Role(user.getID_Role());

        newUser = repository.save(newUser);

        return newUser;

    }


}
