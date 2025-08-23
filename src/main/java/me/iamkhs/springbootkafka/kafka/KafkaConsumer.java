package me.iamkhs.springbootkafka.kafka;

import lombok.extern.slf4j.Slf4j;
import me.iamkhs.springbootkafka.dto.UserRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "javaguide", groupId = "myGroup")
    public void consume(UserRequest request) {
        log.info(String.format("Message received -> %s", request));
    }
}
