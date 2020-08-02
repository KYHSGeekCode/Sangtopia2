package com.kyhsgeekcode.sangtopia2.models

import com.kyhsgeekcode.sangtopia2.R

enum class NaturalResource(
    val easyName: Int,
    val cost: Int
) {
    Fish(R.string.fish, 2),
    Crop(R.string.crop, 2),
    Fruit(R.string.fruit, 1),
    Animal(R.string.animal, 2),
    Metal(R.string.metal, 2),
    Wood(R.string.wood,1),
    Fuel(R.string.fuel, 2)
}