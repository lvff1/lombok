package com.example.lombokdemo.controller;

import com.example.lombokdemo.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @PostMapping("/user/save")
    public UserDto save(UserDto userDto){
        log.info("测试@Slf4j注解打印日志，保存用户:{}", userDto.toString());
        return userDto;
    }
}
