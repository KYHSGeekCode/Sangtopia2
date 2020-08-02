package com.kyhsgeekcode.sangtopia2.models

// interface between game and user input
class Player (
    val name: String
){
    var stars: Int = 0
    val techs = ArrayList<Tech>()
}