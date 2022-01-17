package com.example.lombokdemo.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String gender;
    private Integer age;

    private Pet pet;
}
