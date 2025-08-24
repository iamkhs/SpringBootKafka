package me.iamkhs.springbootkafka.payload;

public record UserRequest(Long id,
                          String name,
                          String email) {
}