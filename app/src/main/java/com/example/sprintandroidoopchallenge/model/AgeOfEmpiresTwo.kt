package com.example.sprintandroidoopchallenge.model

data class AgeOfEmpiresTwo(val civil:String, val unit:String, val structure: String,val technology: String)

data class civil(val civilizations: MutableList<Civilization>)

data class unit(val units: MutableList<Unit>)

data class structure(val structures: MutableList<Structure>)

data class technology(val technologies: MutableList<Technology>)

data class Civilization(val id: String, val expansion: String, val armyType: String, val isFavorite: Boolean)

data class Unit(val id: String, val description: String, val age: String, val isFavorite: Boolean)

data class Structure(val id: String, val description: String, val age: String, val isFavorite: Boolean)

data class Technology(val id: String,val description: String, val age: String, val isFavorite: Boolean)