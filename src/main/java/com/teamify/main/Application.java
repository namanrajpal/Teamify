package com.teamify.main;

import com.teamify.utils.MockDataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Autowired
	private static MockDataLoader mockDataLoader;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//mockDataLoader.loadAllData();
	}
}
