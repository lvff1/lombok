package com.example.lombokdemo;

import lombok.Cleanup;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

@SpringBootTest
class LombokdemoApplicationTests {

    @Test
    void contextLoads() throws Exception {
        @Cleanup BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\file\\11.txt")));
        String tempStr;
        while ((tempStr = reader.readLine()) != null) {
            System.out.println(tempStr);
        }
    }

}
