package io.research.research_assistant;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ResearchAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResearchAssistantApplication.class, args);
	}

//	@Bean
//	public WebClient.Builder webClientBuilder() {
//		return WebClient.builder();
//	}
//
//	@Bean
//	public ObjectMapper objectMapper() {
//		return new ObjectMapper(); // Or customize it if needed
//	}

}
