package com.cydeo.Repository;

import com.cydeo.model.Movie;
import com.cydeo.model.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieCinemaRepository extends JpaRepository<MovieCinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    // tarak  Write a derived query to read movie cinema with id




    //bir tarak daha Write a derived query to count all movie cinemas with a specific cinema id

    //int countMovieCinemasByMovieCinema_Cinema_Id(Long id);
    //ayni tarak  Write a derived query to count all movie cinemas with a specific movie id

    //Write a derived query to list all movie cinemas with higher than a specific date


    //List<MovieCinema> findMovieCinemaByDateTimeGreaterThan(LocalDateTime dateTime);

    //Write a derived query to find the top 3 expensive movies



    //Write a derived query to list all movie cinemas that contain a specific movie name

    //Write a derived query to list all movie cinemas in a specific location

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movie cinemas with higher than a specific date

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to count all movie cinemas by cinema id

    //Write a native query that returns all movie cinemas by location name

}