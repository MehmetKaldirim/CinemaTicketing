package com.cydeo.model;

import com.cydeo.enums.State;
import com.cydeo.enums.Type;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter

public class Movie extends BaseEntity{

    private String name;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private State state;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate releaseDate;
    private Integer duration;
    @Column(columnDefinition = "text")
    private String summary;


    @ManyToMany
    @JoinTable(name="movie_genre_rel",
            joinColumns = @JoinColumn(name="movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genreList;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", state=" + state +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", summary='" + summary + '\'' +
                '}';
    }
}
