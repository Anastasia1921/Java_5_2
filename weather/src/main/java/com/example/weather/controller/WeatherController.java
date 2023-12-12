package com.example.weather.controller;

import com.example.weather.model.Main;
import com.example.weather.model.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {


    @Autowired
    private RestTemplate restTemplate;
    @Value("${appid}")
    private String appId;
    @Value("${url.weather}")
    private String urlWeather;

    @GetMapping
    @Cacheable(cacheNames = "weather", key = "{#lat, #lon}")
    public Main getWeather(@RequestParam String lat, @RequestParam String lon) {
        String request = String.format("%s?lat=%s&lon=%s&units=metric&appid=%s",
                urlWeather, lat, lon, appId);
        System.out.println("проверка - метод выполняется один раз в минуту, независимо от количества запросов");
        return restTemplate.getForObject(request, Root.class).getMain();
    }

}