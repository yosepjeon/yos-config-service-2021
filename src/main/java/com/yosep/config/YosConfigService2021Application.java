package com.yosep.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class YosConfigService2021Application {

	public static void main(String[] args) {
		SpringApplication.run(YosConfigService2021Application.class, args);
	}

}
