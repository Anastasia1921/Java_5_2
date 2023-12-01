package com.example.weather.controller;

import com.example.weather.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {


//    @GetMapping
//    public Iterable<Weather> findAll () {
//        return repository.findAll();
//    }

//    @GetMapping("/{id}")
//    public Optional<Weather> findById (@PathVariable int id) {
//        return repository.findById(id);
//    }

//    @PostMapping
//    public ResponseEntity<Weather> save(@RequestBody Weather weather) {
//        return repository.findById(weather.getId()).isPresent()
//                ? new ResponseEntity(repository.findById(weather.getId()), HttpStatus.OK)
//                : new ResponseEntity(repository.save(weather), HttpStatus.CREATED);
//    }
}
