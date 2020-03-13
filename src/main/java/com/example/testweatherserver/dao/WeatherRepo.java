package com.example.testweatherserver.dao;

import com.example.testweatherserver.model.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepo extends JpaRepository<WeatherData, Integer> {

}