package com.cydeo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "movie_cinema")

public class MovieCinema extends BaseEntity {






    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    @ManyToOne()
    private Movie movie;


    @ManyToOne()
    private Cinema cinema;

}
