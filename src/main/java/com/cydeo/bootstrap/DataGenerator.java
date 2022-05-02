package com.cydeo.bootstrap;


import com.cydeo.Repository.*;
import com.cydeo.enums.Role;
import com.cydeo.enums.State;
import com.cydeo.enums.Type;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDate;


@Component
public class DataGenerator implements CommandLineRunner {

    private final AccountRepository accountRepository;
    private final CinemaRepository cinemaRepository;
    private final GenreRepository genreRepository;
    private final LocationRepository locationRepository;
    private final MovieCinemaRepository movieCinemaRepository;
    private final MovieRepository movieRepository;
    private final TicketRepository ticketRepository;
    private final UserRepository userRepository;

    public DataGenerator(AccountRepository accountRepository, CinemaRepository cinemaRepository, GenreRepository genreRepository, LocationRepository locationRepository, MovieCinemaRepository movieCinemaRepository, MovieRepository movieRepository, TicketRepository ticketRepository, UserRepository userRepository) {
        this.accountRepository = accountRepository;
        this.cinemaRepository = cinemaRepository;
        this.genreRepository = genreRepository;
        this.locationRepository = locationRepository;
        this.movieCinemaRepository = movieCinemaRepository;
        this.movieRepository = movieRepository;
        this.ticketRepository = ticketRepository;
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        System.out.println("-----------------Derived Queries Account-------------------------");
        System.out.println(accountRepository.findByCountryOrState("Germany","Berlin"));

        System.out.println(accountRepository.findByAgeLessThanEqual(31));
        System.out.println("----------------Find By Role --------------------------------------");
        System.out.println(accountRepository.findByRole(Role.ADMIN));
        System.out.println("----------------Find By Age Beetween 28 43--------------------------------------");
        accountRepository.findByAgeBetween(28,43).stream().forEach(System.out::println);
        System.out.println("----------------Starting With --------------------------------------");
        System.out.println(accountRepository.findByAddressIsStartingWith("262"));

        /*System.out.println("-----------------Derived Queries Cinema-------------------------");
        System.out.println(cinemaRepository.findByName("Hall 1 - EMPIRE"));
        System.out.println("-----------------------stream So------------------------------------");
        cinemaRepository.streamTop3BySponsoredNameContains("Play").forEach(System.out::println);
        System.out.println("-----------------------stream So------------------------------------");
        cinemaRepository.streamByLocation_Country("Germany").forEach(System.out::println);
        System.out.println("-------------------same solution with List-----------------------------");
        System.out.println(cinemaRepository.findByLocation_Country("Germany"));
        System.out.println("-------------------same solution with List to stream-----------------------------");
        cinemaRepository.findByLocation_Country("Germany").stream().forEach(System.out::println);

        System.out.println("-------------------------Or Contains---------------------------------------------");
        System.out.println(cinemaRepository.findByNameContainingOrSponsoredNameContaining("SQUARE 13","Play"));



        System.out.println("-----------------Derived Queries MovieCinemas-------------------------");
        //System.out.println("count of movie cinema by Cinema Id" + movieCinemaRepository.countMovieCinemasByMovieCinema_Cinema_Id(3L));
        //System.out.println("Top 3 expensivi\n" + movieCinemaRepository.findTopOrderByMovie_Price());

         System.out.println("-----------------Derived Queries Movies-------------------------");
        System.out.println("Movie find by name " + movieRepository.findByName("The Gentleman"));
        System.out.println("movies between price\n" + movieRepository.findByPriceBetween( 10.0,20.2));
        System.out.println("find movies by duration\n" +  movieRepository.findByDuration(100));
        // Tarrak System.out.println("find movies  by release date greater Than Date\n" +  movieRepository.findByReleaseDateGreaterThan((LocalDate) 2020-01-24 00:00:00));
        System.out.println("find movie by state and type  \n" + movieRepository.findByStateAndType(State.ACTIVE, Type.PREMIER));

       System.out.println("-----------------Derived Tickets User-------------------------");

        System.out.println("Count of Tickets = " + ticketRepository.countTicketsByUserAccount_Username("faith"));
        System.out.println("Ticket List By Email = " + ticketRepository.findByUserAccount_Email("johnnie@email.com"));
        System.out.println("Count of Tickets by Movie Name = " + ticketRepository.countTicketsByMovieCinema_Movie_Name("A Beautiful Mind"));
        //System.out.println("List of tickets between  dates " + ticketRepository.findByMovieCinema_DateTimeBetweenDateTimeAndDateTime(2019-12-05,2020-12-05 );

        System.out.println("-----------------Derived Queries User-------------------------");
        System.out.println(userRepository.findByEmail("bernard@email.com"));
        System.out.println(userRepository.findByUsername("bernard"));
        System.out.println(userRepository.findByAccount_NameContains("Josie"));
        System.out.println("age is Greater than  \n" + userRepository.findByAccount_AgeIsGreaterThan(55));
        */
    }

}