package com.example.Ecommercewebsite.Service;

import com.example.Ecommercewebsite.Dao.UserRepository;
import com.example.Ecommercewebsite.Model.UserModel;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
   public UserRepository repository;

    public UserModel saveUser(UserModel user) {
       return repository.save(user);
    }

    public List<UserModel> findAllUser() {
      return  repository.findAll();
    }

    public UserModel findUserById(Integer userId) {
        return repository.findById(userId).get();
    }

    public void deleteUserById(Integer userId) {
        repository.deleteById(userId);
    }

    public void updateUserById(Integer userId, UserModel newUser) {
        UserModel user = findUserById(userId);
        user.setUserName(newUser.getUserName());
        user.setUserPassword(newUser.getUserPassword());
        user.setUserEmail(newUser.getUserEmail());
        user.setUserPhoneNumber(newUser.getUserPhoneNumber());


        repository.save(user);
    }
}
