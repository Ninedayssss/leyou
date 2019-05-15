package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author itsNine
 * @create 2019-03-28 15:25
 */
@EnableEurekaServer
@SpringBootApplication
public class LyRegistry {
	public static void main(String[] args) {
		SpringApplication.run(LyRegistry.class);
	}
}
