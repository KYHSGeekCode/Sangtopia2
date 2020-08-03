package com.kyhsgeekcode.sangtopia2.models

import com.kyhsgeekcode.sangtopia2.R

enum class Tech(
    val name2: Int,
    val pre: List<Tech>,
    val cost: Int
) {
    Fishing(R.string.fishing, emptyList(), 5),
    Hunting(R.string.hunting, emptyList(), 5),
    Organization(R.string.organization, emptyList(), 5),
    Forestry(R.string.forestry, emptyList(), 5),
    Crafting(R.string.crafting, listOf(Forestry), 5),
    Mining(R.string.mining, listOf(Crafting), 7),
    Smelting(R.string.smelting, listOf(Mining), 9),

    Farming(R.string.farming, listOf(Organization), 7),
    FishFarming(R.string.fish_farm, listOf(Fishing), 7),
    LivestockFarming(R.string.livestock_farming, listOf(Organization, Farming), 7),
    Riding(R.string.riding, listOf(LivestockFarming), 7),

    Compass(R.string.compass, listOf(Mining), 6),

    Shipbuilding(R.string.shipbuilding, listOf(Fishing, Crafting), 7),
    Sailing(R.string.sailing, listOf(Shipbuilding), 7),
    Navigation(R.string.navigation, listOf(Sailing, Compass), 8),
    IceBreaking(R.string.icebreaking, listOf(Navigation, Smelting), 10),

    ;

    fun canTryExplore(player: Player) =
        !player.techs.contains(this) and player.techs.containsAll(pre)


}