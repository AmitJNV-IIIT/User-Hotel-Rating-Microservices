package com.ps.userservice.repositories;

import com.ps.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,String> {

}
