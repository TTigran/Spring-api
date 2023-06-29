package com.example.springapi.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "myTopic")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}