package com.example.docker1;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Docker1Application {

@RequestMapping("/home")
  public String home() {
    return "Hello Docker1 World";
  }

	public static void main(String[] args) {
		SpringApplication.run(Docker1Application.class, args);
		System.out.println("hi");
	}

}