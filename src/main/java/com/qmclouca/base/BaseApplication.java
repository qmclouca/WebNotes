package com.qmclouca.base;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {
		"com.qmclouca.base.models",
		"com.qmclouca.base.repositories",
		"com.qmclouca.base.controllers",
		"com.qmclouca.base.services.Implementations",
		"com.qmclouca.base.repositories",
		"com.qmclouca.base.repositories.Implementations",
		"com.qmclouca.base.utils.Auth",
		"com.qmclouca.base.configs",
})
public class BaseApplication {
	public static void main(String[] args) {
		SpringApplication.run(BaseApplication.class, args);
	}
}
