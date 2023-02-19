package com.example.Ecommercewebsite.Dao;

import com.example.Ecommercewebsite.Model.UserModel;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Integer> {

}