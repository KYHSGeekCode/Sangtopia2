package com.kyhsgeekcode.sangtopia2.models

class Village(
    val coord: Coord2,
    val name: String,
    var owner: Player? = null
) {
    val territory = ArrayList<Tile>()
}