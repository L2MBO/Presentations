package com.example.battletanks.enums

import com.example.battletanks.enums.Material

enum class Material(val tankConGoThrough: Boolean) {
    EMPTY(true),
    BRICK(false),
    CONCRETE(false),
    GRASS(true),
}