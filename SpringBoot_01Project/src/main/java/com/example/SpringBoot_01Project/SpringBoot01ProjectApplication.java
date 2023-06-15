package com.example.SpringBoot_01Project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_01Project.pojo.Student;

@SpringBootApplication
@RestController
public class SpringBoot01ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01ProjectApplication.class, args);
	}
}
