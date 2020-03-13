package com.example.testweatherserver.controller;

import com.example.testweatherserver.dao.WeatherRepo;
import com.example.testweatherserver.model.WeatherData;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    private final WeatherRepo weatherRepo;

    public WeatherController(WeatherRepo weatherRepo) {
        this.weatherRepo = weatherRepo;
    }

    @GetMapping("/weather")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<WeatherData> getAllWeatherData(){
        return weatherRepo.findAll();
    }
}
