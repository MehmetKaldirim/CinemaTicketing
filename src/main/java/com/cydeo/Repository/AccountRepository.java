package com.cydeo.Repository;

import com.cydeo.enums.Role;
import com.cydeo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state
    List<Account> findByCountryOrState(String country,String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<Account> findByAgeLessThanEqual(Integer year);
    //Write a derived query to list all accounts with a specific role
    List<Account> findByRole(Role role);
    //Write a derived query to list all accounts between a range of ages
    List<Account> findByAgeBetween(Integer a, Integer b);
    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<Account> findByAddressIsStartingWith(String keyword);
    //Write a derived query to sort the list of accounts with age
    Stream<Account> streamByAgeOrderByAge(Integer age);
    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts



    //Write a JPQL query to list all admin accounts
    

    //Write a JPQL query to sort all accounts with age

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value

    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city

    //Write a native query to read all accounts with an age lower than a specific value

}
