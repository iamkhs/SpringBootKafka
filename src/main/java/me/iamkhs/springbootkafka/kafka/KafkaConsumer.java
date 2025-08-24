package me.iamkhs.springbootkafka.kafka;

import lombok.extern.slf4j.Slf4j;
import me.iamkhs.springbootkafka.payload.UserRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "user_requests_json", groupId = "myGroup")
    public void consumeJons(UserRequest request){
        log.info("Message received -> {}", request);
    }
}
