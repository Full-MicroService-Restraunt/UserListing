package com.fullstack.UserService.UserService.repo;

import com.fullstack.UserService.UserService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
