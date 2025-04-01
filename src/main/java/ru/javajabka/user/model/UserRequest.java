package ru.javajabka.user.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequest {
    private final String userName;
    private final String password;
}