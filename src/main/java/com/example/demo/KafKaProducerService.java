package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafKaProducerService {
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
 
	@RequestMapping(value = "/send/{message}", method=RequestMethod.GET)
    public void sendMessage(@PathVariable String message) 
    {
        this.kafkaTemplate.send("topic_aliens", message);
        System.out.println("Success..........");
    }
}
