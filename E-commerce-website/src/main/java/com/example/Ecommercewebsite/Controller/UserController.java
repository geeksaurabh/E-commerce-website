package com.example.Ecommercewebsite.Controller;

import com.example.Ecommercewebsite.Model.UserModel;
import com.example.Ecommercewebsite.Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/v1")

public class UserController {

    @Autowired
  public  UserService service;

    @PostMapping("/add-user")
    public String addUser( @RequestBody UserModel user){
        service.saveUser(user);
        return "user saved";
    }
    @GetMapping("/find-all-user")
    public List<UserModel> findAllUser() {
        return service.findAllUser();
    }
       @GetMapping("/find-user-by-userId/{userId}")
     public UserModel findUserById(@PathVariable Integer userId){
           return service.findUserById(userId);
        }
        @DeleteMapping("/delete-user-by-userId/{userId}")
    public void deleteUserById(@PathVariable Integer userId){
        service.deleteUserById(userId);
        }
    @PutMapping("update-user-by-userId/{userId}")
    public ResponseEntity<String> updateUserById( @PathVariable Integer userId, @RequestBody UserModel user){
        service.updateUserById(userId,user);
        return new ResponseEntity<>("user updated",HttpStatus.CREATED);
    }
    }

