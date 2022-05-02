package com.cydeo.Repository;

import com.cydeo.enums.State;
import com.cydeo.enums.Type;
import com.cydeo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a movie with a name (it s working after deleting genre)

    Movie findByName(String name);


    //Write a derived query to list all movies between a range of prices (BigDecimal not work ask it)

    List<Movie> findByPriceBetween(double a, double b);


    //Write a derived query to list all movies where duration exists in the specific list of duration
    List<Movie> findByDuration(Integer duration);
    //Write a derived query to list all movies with higher than a specific release date
    List<Movie> findByReleaseDateGreaterThan(LocalDate releaseDate);
    //Write a derived query to list all movies with a specific state and type
    List<Movie> findByStateAndType(State state , Type type);
    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movies between a range of prices

    //Write a JPQL query that returns all movie names

    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns a movie by name

    //Write a native query that return the list of movies in a specific range of prices

    //Write a native query to return all movies where duration exists in the range of duration

    //Write a native query to list the top 5 most expensive movies

}
