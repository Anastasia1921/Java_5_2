package com.example.weather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Temperature {
    private double min;
    private double max;
    private double afternoon;
    private double night;
    private double evening;
    private double morning;
//                "min":286.48,
//                "max":299.24,
//                "afternoon":296.15,
//                "night":289.56,
//                "evening":295.93,
//                "morning":287.59
}
