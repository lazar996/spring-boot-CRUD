package com.example.springbootcrud.service;

import com.example.springbootcrud.dto.UserDTO;
import com.example.springbootcrud.model.Role;
import com.example.springbootcrud.model.User;
import com.example.springbootcrud.repository.RoleRepo;
import com.example.springbootcrud.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    RoleRepo roleRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
    public User getUserById(Long id){ return  userRepo.findUserById(id);}

    public User createUser(UserDTO userDTO){

        Role role = roleRepo.getById(userDTO.getRole_id());
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setRole(role);

        return userRepo.save(user);
    }

    public void deleteById(Long id){

        userRepo.deleteById(id);
    }

    public User updateUser(UserDTO userDTO,Long id){

        User user = userRepo.findUserById(id);
        Role role = roleRepo.getById(user.getRole().getId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setRole(role);

       return userRepo.save(user);
    }
}
