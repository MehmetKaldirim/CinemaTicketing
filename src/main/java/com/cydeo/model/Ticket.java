package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
public class Ticket extends BaseEntity{



    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate dateTime;

    private Integer rowNumber;
    private Integer seatNumber;

    @ManyToOne()
    private MovieCinema movieCinema;

    @ManyToOne(fetch= FetchType.LAZY)
    private User userAccount;


}
