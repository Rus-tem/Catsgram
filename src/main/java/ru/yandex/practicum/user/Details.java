package ru.yandex.practicum.user;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
// Детализированная информация о пользователе
public class Details {
    // Электронная почта
    @NonNull
    private String email;
    // Имя
    @NonNull
    private String firstName;
    // Фамилия
    @NonNull
    private String lastName;
    // Дополнительная информация
    private String information;
    // Дата рождения
    private Date dayOfBirthday;
    // Пол
    private Gender gender = Gender.UNKNOWN;

}