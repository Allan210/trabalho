package br.com.fiap.Trafegos45;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Trafegos45Application {

	public static void main(String[] args) {
		SpringApplication.run(Trafegos45Application.class, args);
	}

}
