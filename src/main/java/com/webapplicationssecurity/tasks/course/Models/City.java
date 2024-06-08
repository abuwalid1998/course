package com.webapplicationssecurity.tasks.course.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class City {
    private int ID;
    private String name;
    private String countryCode;
    private String district;
    private int population;
}