package com.kyhsgeekcode.sangtopia2.models

typealias Coord2 = Pair<Int, Int>
typealias Coord3 = Triple<Int, Int, Int>

class Tile(
    var terrainType: TerrainType,
    var climate: Climate,
    var naturalResource: NaturalResource?
) {

}