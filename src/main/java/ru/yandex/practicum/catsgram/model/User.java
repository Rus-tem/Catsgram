package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;


@Getter
@Setter
@EqualsAndHashCode(of = {"email"})
@ToString
public class User {
    private Long id;
    @NonNull
    private String username;
    private String email;
    private String password;
    private Instant registrationDate;

}
