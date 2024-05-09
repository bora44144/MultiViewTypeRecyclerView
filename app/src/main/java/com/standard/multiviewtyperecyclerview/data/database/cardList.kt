package com.standard.multiviewtyperecyclerview.data.database

import com.standard.multiviewtyperecyclerview.data.database.model.CardEntity
import com.standard.multiviewtyperecyclerview.presentation.main.main.MultiViewEnum

fun cardList(): List<CardEntity> {
    return listOf(
        CardEntity(
            0,
            "Anderson",
            "2423 3581 9503 2412",
            "A Debit Card",
            "21 / 24",
            3100.30,
            "Visa",
            MultiViewEnum.BLUE
        ),
        CardEntity(
            1,
            "Anderson",
            "1234 5678 1234 1111",
            "A Prepaid Card",
            "19 / 25",
            5431.40,
            "Master",
            MultiViewEnum.LIGHTBLUE
        ),
        CardEntity(
            2,
            "Anderson",
            "4443 2345 3464 1231",
            "A Credit Card",
            "23 / 28",
            1030.99,
            "Union",
            MultiViewEnum.ORANGE
        )
    )
}