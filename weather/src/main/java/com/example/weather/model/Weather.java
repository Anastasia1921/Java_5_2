package com.example.weather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Weather{
    public int id;
    public String main;
    public String description;
    public String icon;
}
