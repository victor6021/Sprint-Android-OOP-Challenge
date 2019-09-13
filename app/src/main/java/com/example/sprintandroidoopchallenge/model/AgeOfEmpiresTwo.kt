package com.example.sprintandroidoopchallenge.model

data class AgeOfEmpiresTwo(val civilizations: MutableList<Civilization>,
                      val units: MutableList<Unit>,
                      val structures: MutableList<Structure>,
                      val technologies: MutableList<Technology>)

data class Civilization(val id: String, val expansion: String, val armyType: String, val isFavorite: Boolean)

data class Unit(val id: String, val description: String, val age: String, val isFavorite: Boolean)

data class Structure(val id: String, val description: String, val age: String, val isFavorite: Boolean)

data class Technology(val id: String,val description: String, val age: String, val isFavorite: Boolean)