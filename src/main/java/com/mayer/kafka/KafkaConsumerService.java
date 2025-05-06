package com.mayer.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "input-topic", groupId = "my-consumer-group")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Received message from Kafka: " + record.value());
    }
}
