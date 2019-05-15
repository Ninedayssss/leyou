package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author itsNine
 * @create 2019-03-30 11:42
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LyUploadApplication {
	public static void main(String[] args) {
		SpringApplication.run(LyUploadApplication.class);
	}
}
