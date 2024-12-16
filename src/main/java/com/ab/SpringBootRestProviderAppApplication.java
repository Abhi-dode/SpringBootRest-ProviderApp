package com.ab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class SpringBootRestProviderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestProviderAppApplication.class, args);
		System.out.println("ClassPath:"+System.getProperty("java.class.path"));
	}

}
