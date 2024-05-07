package com.standard.multiviewtyperecyclerview.data

import com.standard.multiviewtyperecyclerview.presentation.MultiViewEnum

fun cardList(): List<Card> {
    return listOf(
        Card(
            0,
            "Anderson",
            "2423 3581 9503 2412",
            "A Debit Card",
            "21 / 24",
            3100.30,
            "Visa",
            MultiViewEnum.BLUE
        ),
        Card(
            1,
            "Anderson",
            "1234 5678 1234 1111",
            "A Prepaid Card",
            "19 / 25",
            5431.40,
            "Master",
            MultiViewEnum.LIGHTBLUE
        ),
        Card(
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