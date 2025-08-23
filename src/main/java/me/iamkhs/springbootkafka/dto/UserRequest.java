package me.iamkhs.springbootkafka.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private Long id;
    private String name;
    private String email;
}
