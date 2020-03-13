package com.example.testweatherserver.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

@Entity
@Table(name = "weather_data")
@Getter @Setter
public class WeatherData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Double temp;

    private Double pressure;

    private Double wet;

    private Date date;
}
