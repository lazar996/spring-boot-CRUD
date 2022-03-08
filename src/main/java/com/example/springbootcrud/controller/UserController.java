package com.example.springbootcrud.controller;

import com.example.springbootcrud.dto.UserDTO;
import com.example.springbootcrud.model.User;
import com.example.springbootcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "api/user")
    public ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<List<User>>(this.userService.getAllUsers(), HttpStatus.OK);
    }

    @RequestMapping(value = "api/user/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long id) {

        return new ResponseEntity<User>(this.userService.getUserById(id),HttpStatus.OK);
    }

    @PostMapping(value = "api/user")
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO){

        return new ResponseEntity<User>(this.userService.createUser(userDTO), HttpStatus.CREATED);
    }

    @RequestMapping(value = "api/user/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> deleteById(@PathVariable(value = "id")Long id){
        userService.deleteById(id);
        return new ResponseEntity<User>(HttpStatus.OK);
    }

    @PutMapping(value = "api/user/{id}")
    public ResponseEntity<User> editUser(@RequestBody UserDTO userDTO, @PathVariable(value = "id")Long id){
        if (userDTO.getId()==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        User updateUser = userService.updateUser(userDTO, id);
        return new ResponseEntity<>(updateUser,HttpStatus.OK);
    }

}
