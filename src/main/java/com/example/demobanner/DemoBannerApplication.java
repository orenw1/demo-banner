package com.example.demobanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoBannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBannerApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("=== demo banner application ===");
		};
	}
}
