package me.iamkhs.springbootkafka.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.iamkhs.springbootkafka.payload.UserRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, UserRequest> kafkaTemplate;

    public void sendMessage(UserRequest data){
        log.info("Message sent -> {}", data);
        Message<UserRequest> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "user_requests_json")
                .build();

        kafkaTemplate.send(message);
    }
}
