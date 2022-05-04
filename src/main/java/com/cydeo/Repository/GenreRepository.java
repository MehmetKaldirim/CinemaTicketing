package com.cydeo.Repository;

import com.cydeo.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that return all genres

    @Query("SELECT g FROM Genre g")
    List<Genre> getAllGenres();
    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that return all genres
    @Query("SELECT g FROM Genre g")
    List<Genre> fetchAll();

    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns genres by containing name
    @Query(value = "SELECT * FROM genre WHERE name ILIKE concat('%', ?1, '%')", nativeQuery = true)
    List<Genre> retrieveByName(@Param("name") String name);



    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns genres by containing name my is not genug
    @Query( value= "SELECT * FROM genre  WHERE g.name=?1",nativeQuery = true)
    List<Genre> getGenresContainsName(String name);
}

