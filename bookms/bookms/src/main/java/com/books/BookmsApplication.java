package com.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableAutoConfiguration
//@EntityScan(basePackages={"com.books.model.entities"})
//@EnableSwagger2
//@EnableCaching
//@ComponentScan(basePackages= {"com.books.Controller"})
public class BookmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmsApplication.class, args);
	}

}
