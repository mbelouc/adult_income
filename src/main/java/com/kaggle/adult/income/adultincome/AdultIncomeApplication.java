package com.kaggle.adult.income.adultincome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AdultIncomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdultIncomeApplication.class, args);
	}

}
