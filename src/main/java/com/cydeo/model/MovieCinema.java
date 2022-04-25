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

    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;


    @ManyToOne(fetch = FetchType.LAZY)
    private Cinema cinema;

}
