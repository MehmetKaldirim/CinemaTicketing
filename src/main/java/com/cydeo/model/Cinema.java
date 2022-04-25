package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cinema")
@NoArgsConstructor
@Data
public class Cinema extends BaseEntity {

    private String name;
    private String sponsoredName;
    @ManyToOne(fetch = FetchType.LAZY)//
    @JoinColumn(name="location_id")
    private Location location;






}
