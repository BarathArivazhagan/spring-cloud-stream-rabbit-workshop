package com.barath.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

@SpringBootApplication
@EnableBinding(Source.class)
public class SourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SourceApplication.class, args);
	}
	

	@Bean
	@InboundChannelAdapter(value = Source.OUTPUT)
	public Message<String> sourceMessage() {
	
	 System.out.println("source is called ");
	 return new GenericMessage<String>("Hello");
	}

}
