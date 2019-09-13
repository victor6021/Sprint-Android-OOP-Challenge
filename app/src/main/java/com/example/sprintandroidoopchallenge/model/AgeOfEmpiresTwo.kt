package com.example.sprintandroidoopchallenge.model

data class AgeOfEmpiresTwo(val civil: Civil, val units:Units, val structures: Structures,val technologies: Technologies)

data class Civil(val civilizations: MutableList<Civilization>)

data class Units(val unit: MutableList<Unit>)

data class Structures(val structure: MutableList<Structure>)

data class Technologies(val technology: MutableList<Technology>)

data class Civilization(val id: String, val expansion: String, val armyType: String, val isFavorite: Boolean)

data class Unit(val id: String, val description: String, val age: String, val isFavorite: Boolean)

data class Structure(val id: String, val description: String, val age: String, val isFavorite: Boolean)

data class Technology(val id: String,val description: String, val age: String, val isFavorite: Boolean)