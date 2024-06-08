package com.webapplicationssecurity.tasks.course.ModelDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CityDTO {
    private int ID;
    private String name;
    private String countryCode;
    private String district;
    private int population;
}