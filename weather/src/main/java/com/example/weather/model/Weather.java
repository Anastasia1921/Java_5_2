package com.example.weather.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;
import java.util.TimeZone;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Weather {
    @NonNull private double lat;
    @NonNull private double lon;
    @NonNull private TimeZone tz;
    @NonNull private Date date;
    @NonNull private String units;
    @NonNull private Cloud_cover cloud_cover;  ///???
    @NonNull private Humidity humidity;
    @NonNull private Precipitation precipitation;
    @NonNull private Temperature temperature;
    @NonNull private Pressure pressure;
    @NonNull private Wind wind;


//https://api.openweathermap.org/data/3.0/onecall/day_summary?lat={lat}&lon={lon}&date={date}&appid={API key}
//https://api.openweathermap.org/data/3.0/onecall/day_summary?lat=60.45&lon=-38.67&date=2023-03-30&tz=+03:00&appid={API key}

//    {
//        "lat":33,
//        "lon":35,
//        "tz":"+02:00",
//        "date":"2020-03-04",
//        "units":"standard",
//        "cloud_cover":{
//        "afternoon":0
//    },
//        "humidity":{
//        "afternoon":33
//    },
//        "precipitation":{
//        "total":0
//    },
//        "temperature":{
//        "min":286.48,
//                "max":299.24,
//                "afternoon":296.15,
//                "night":289.56,
//                "evening":295.93,
//                "morning":287.59
//    },
//        "pressure":{
//        "afternoon":1015
//    },
//        "wind":{
//        "max":{
//            "speed":8.7,
//            "direction":120
//        }
//    }
//    }
}
