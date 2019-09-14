package com.example.sprintandroidoopchallenge.viewmodel

import com.example.sprintandroidoopchallenge.model.*
import com.example.sprintandroidoopchallenge.model.Unit

object AoETwoViewModel: ArrayList<AgeOfEmpiresTwo>(
    arrayListOf(
        Civilization(
            id = "1",
            name = "Aztecs",
            expansion = "The Conquerors",
            isFavorite = false
        ),
        Unit(
            id = "1",
            name = "Archer",
            expansion = "Age of Kings",
            isFavorite = false
        ),
        Structure(
            id = "1",
            name = "Barracks",
            expansion = "Age of Kings",
            isFavorite = false
        ),
        Technology(
            id = "1",
            name = "Crossbowman",
            expansion = "Age of Kings",
            isFavorite = false
        )
    )
)