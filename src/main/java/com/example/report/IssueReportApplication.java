package com.example.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class IssueReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssueReportApplication.class, args);
	}

}
