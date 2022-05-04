package com.cydeo.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Ticket extends BaseEntity{



    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate dateTime;

    private Integer rowNumber;
    private Integer seatNumber;

    @ManyToOne()
    private MovieCinema movieCinema;

    @ManyToOne(fetch= FetchType.LAZY)
    private User userAccount;

    @Override
    public String toString() {
        return "Ticket{" +
                "dateTime=" + dateTime +
                ", rowNumber=" + rowNumber +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
