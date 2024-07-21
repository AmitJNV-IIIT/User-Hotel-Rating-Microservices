package com.ps.userservice.services;

import com.ps.userservice.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);


}
