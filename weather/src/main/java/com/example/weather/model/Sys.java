package com.example.weather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sys{
    public String country;
    public int sunrise;
    public int sunset;
}
