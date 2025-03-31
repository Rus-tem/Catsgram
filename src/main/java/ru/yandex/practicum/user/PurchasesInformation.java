package ru.yandex.practicum.user;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
// Информация о покупках пользователя
public class PurchasesInformation {
    // дата последней покупки
    private Date lastPurchase;
    // Общее количество покупок
    private long purchaseCounts = 0;
}