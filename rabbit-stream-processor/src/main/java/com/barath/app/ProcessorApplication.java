package com.barath.app;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.GenericMessage;

@SpringBootApplication
@EnableBinding(Processor.class)
public class ProcessorApplication {
	
	private static final Logger logger=LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {
		SpringApplication.run(ProcessorApplication.class, args);
	}
	
	@StreamListener(Processor.INPUT)
	@SendTo(Processor.OUTPUT)
	public Message<String> processOrder(Message<String> message) {
		logger.info("Processing order: " + message);
		System.out.println("Processing the message");
		String payload=(String) message.getPayload();
		return new GenericMessage<String>(payload.toUpperCase());
	}

}
