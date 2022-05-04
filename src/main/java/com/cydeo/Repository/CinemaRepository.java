package com.cydeo.Repository;

import com.cydeo.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to get cinema with a specific name
    List<Cinema> findByName(String name);

    //Write a derived query to read sorted the top 3 cinemas that contains a specific sponsored name
    Stream<Cinema> streamTop3BySponsoredNameContains(String pattern);
    List<Cinema> findFirst3BySponsoredNameContainingOrderBySponsoredName(String sponsoredName);//his answer
    //Write a derived query to list all cinemas in a specific country
    Stream<Cinema> streamByLocation_Country(String country);
    List<Cinema> findByLocation_Country(String country);
    List<Cinema> findAllByLocationCountry(String country);//his answer

    //Write a derived query to list all cinemas with a specific name or sponsored name
    List<Cinema> findByNameContainingOrSponsoredNameContaining(String pattern,String sponsoredName);
    List<Cinema> findAllByNameOrSponsoredName(String name, String sponsoredName);
    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to read the cinema name with a specific id
    @Query("SELECT c.name FROM Cinema c WHERE c.id =?1")
    Cinema getCinemaById(Long id);

    @Query("SELECT c.name FROM Cinema c WHERE c.id = ?1") //his answer
    String fetchById(@Param("id") Long id);

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all cinemas by location country
    @Query(value = "SELECT * FROM cinema c JOIN location l " +
            "ON l.id = c.location_id WHERE l.country = ?1", nativeQuery = true)
    List<Cinema> retrieveAllLocationCountry(@Param("locationCountry") String locationCountry);

    //Write a native query to read all cinemas by name or sponsored name contains a specific pattern
    @Query(value = "SELECT * FROM cinema WHERE name ILIKE concat('%', ?1, '%') " +
            "OR sponsored_name ILIKE concat('%', ?1, '%')", nativeQuery = true)
    List<Cinema> retrieveAllByNameOrSponsoredName(@Param("pattern") String pattern);

    //Write a native query to sort all cinemas by name
    @Query(value = "SELECT * FROM cinema ORDER BY name", nativeQuery = true)
    List<Cinema> sortByName();

    //Write a native query to distinct all cinemas by sponsored name
    @Query(value = "SELECT DISTINCT sponsored_name FROM cinema", nativeQuery = true)
    List<String> distinctBySponsoredName();  //TODO (Fixed) The return type was List<Cinema> instead of List<String>


}
