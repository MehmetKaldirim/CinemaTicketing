package com.cydeo.Repository;

import com.cydeo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a user with an email?
    List<User> findByEmail(String email);

    //Write a derived query to read a user with an username?
    List<User> findByUsername(String Username);

    //Write a derived query to list all users that contain a specific name?
    List<User> findByAccount_NameContains(String pattern);
    //Write a derived query to list all users that contain a specific name in the ignore case mode?
    List<User> findByAccount_NameIgnoreCaseContains(String pattern);
    //Write a derived query to list all users with an age greater than a specified age?
    List<User> findByAccount_AgeIsGreaterThan(Integer age);
    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns a user read by email?

    //Write a JPQL query that returns a user read by username?

    //Write a JPQL query that returns all users?

    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns all users that contain a specific name?

    //Write a native query that returns all users?

    //Write a native query that returns all users in the range of ages?

    //Write a native query to read a user by email?

}
