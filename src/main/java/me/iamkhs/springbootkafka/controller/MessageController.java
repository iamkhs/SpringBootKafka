package me.iamkhs.springbootkafka.controller;

import lombok.RequiredArgsConstructor;
import me.iamkhs.springbootkafka.dto.UserRequest;
import me.iamkhs.springbootkafka.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<?> publishMsg(@RequestBody UserRequest request) {
        this.kafkaProducer.sendMessage(request);
        return ResponseEntity.ok("Message published");
    }
}
