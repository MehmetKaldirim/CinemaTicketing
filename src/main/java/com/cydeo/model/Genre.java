package com.cydeo.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter

public class Genre extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy = "genreList")
    private List<Movie> movieList;

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                ", movieList=" + movieList +
                '}';
    }
}
