package me.iamkhs.springbootkafka.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.iamkhs.springbootkafka.dto.UserRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<Object, UserRequest> kafkaTemplate;

    public void sendMessage(UserRequest request){
        log.info("Sending message: {}", request);
        this.kafkaTemplate.send("javaguide", request);
    }
}
