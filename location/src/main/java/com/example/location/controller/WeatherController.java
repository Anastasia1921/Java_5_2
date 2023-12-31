package com.example.location.controller;

import com.example.location.model.Geodata;
import com.example.location.model.Weather;
import com.example.location.repository.GeodataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
public class WeatherController {

    @Autowired
    private GeodataRepository repository;

    @Autowired
    private RestTemplate restTemplate;
    // private RestTemplate restTemplate = new RestTemplate();

    @Value("${weather.url}")
    String weatherUrl;

    @GetMapping("/weather")
    public Weather redirectRequestWeather(@RequestParam String location) {
        Geodata geodata = repository.findByName(location).get();
        String url = String.format("http://%s/?lat=%s&lon=%s", weatherUrl, geodata.getLat(), geodata.getLon());
        return restTemplate.getForObject(url, Weather.class);
    }
    //
    @GetMapping
    public Optional<Geodata> getWeather(@RequestParam String location) {
        return repository.findByName(location);
    }

    @PostMapping
    public Geodata save(@RequestBody Geodata geodata) {
        return repository.save(geodata);
    }

}
