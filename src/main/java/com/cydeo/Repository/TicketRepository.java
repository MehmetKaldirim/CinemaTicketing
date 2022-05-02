package com.cydeo.Repository;

import com.cydeo.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to count how many tickets a user bought
    int countTicketsByUserAccount_Username(String userName);

    //Write a derived query to list all tickets by specific email
    List<Ticket> findByUserAccount_Email(String email);
    // Olmamistutr Write a derived query to count how many tickets are sold for a specific movie
    int countTicketsByMovieCinema_Movie_Name(String name);
    //BU da olmamistur Write a derived query to list all tickets between a range of dates
    //List<Ticket> findByMovieCinema_DateTimeBetweenDateTimeAndDateTime(LocalDateTime a, LocalDateTime b);
    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all tickets are bought from a specific user

    //Write a JPQL query that returns all tickets between a range of dates

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to count the number of tickets a user bought

    //Write a native query to count the number of tickets a user bought in a specific range of dates

    //Write a native query to distinct all tickets by movie name

    //Write a native query to find all tickets by user email

    //Write a native query that returns all tickets

    //Write a native query to list all tickets where a specific value should be containable in the username or name or movie name

}