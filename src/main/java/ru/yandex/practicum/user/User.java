package ru.yandex.practicum.user;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class User {
    // Детализированная информация о пользователе
    @NonNull
    private Details details;
    // Информация о покупках пользователя
    private PurchasesInformation purchasesInformation = new PurchasesInformation();

}