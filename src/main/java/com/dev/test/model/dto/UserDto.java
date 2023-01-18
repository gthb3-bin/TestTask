package com.dev.test.model.dto;

import com.dev.test.model.Car;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String lastName;
    private List<Car> cars;
}
