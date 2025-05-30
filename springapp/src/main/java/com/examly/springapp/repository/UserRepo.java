package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.examly.springapp.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{

    @Query("select user from User user where user.email=?1")
    User findByEmail(String email);
    
}
