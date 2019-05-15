package com.leyou.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author itsNine
 * @create 2019-03-28 15:29
 */
@EnableZuulProxy
@SpringCloudApplication
public class LyGateway {
	public static void main(String[] args) {
		SpringApplication.run(LyGateway.class);
	}
}
