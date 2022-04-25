package com.cydeo.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="location")
@NoArgsConstructor
@Data
public class Location extends BaseEntity{

    private String name;
    private BigDecimal lattitude;
    private BigDecimal longitude;
    private String country;
    private String city;
    private String state;
    private int postalCode;
    private String address;


}
