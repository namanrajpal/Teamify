package com.teamify.main;

import com.teamify.utils.MockDataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.teamify.controllers","com.teamify.entities","com.teamify.services","com.teamify.utils"})
@EnableJpaRepositories("com.teamify.repositories")
@EntityScan(basePackages = "com.teamify.entities")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
