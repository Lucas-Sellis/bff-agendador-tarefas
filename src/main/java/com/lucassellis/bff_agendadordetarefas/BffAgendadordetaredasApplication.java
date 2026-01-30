package com.lucassellis.bff_agendadordetarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BffAgendadordetaredasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffAgendadordetaredasApplication.class, args);
	}

}
