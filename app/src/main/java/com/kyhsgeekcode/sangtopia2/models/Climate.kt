package com.kyhsgeekcode.sangtopia2.models

enum class Climate (
    val temparature: Int,
    val humidity: Int,
    val wind: Int
) {
    Tropical(25, 80, 2),
    Dry(23, 10, 3),
    Temperate(18, 60, 1),
    Continental(10, 30, 2),
    Polar(-10, 15, 3),
    ;

}