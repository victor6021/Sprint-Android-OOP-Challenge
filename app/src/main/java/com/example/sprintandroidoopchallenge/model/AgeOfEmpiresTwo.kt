package com.example.sprintandroidoopchallenge.model

open class AgeOfEmpiresTwo(val id: String, val expansion: String, val armyType: String, val isFavorite: Boolean)

class Civilization(id: String, expansion: String, armyType: String, isFavorite: Boolean): AgeOfEmpiresTwo(id,expansion, armyType,isFavorite)

class Unit(id: String, expansion: String, armyType: String, isFavorite: Boolean): AgeOfEmpiresTwo(id,expansion, armyType,isFavorite)

class Structure(id: String, expansion: String, armyType: String, isFavorite: Boolean): AgeOfEmpiresTwo(id,expansion, armyType,isFavorite)

class Technology(id: String, expansion: String, armyType: String, isFavorite: Boolean): AgeOfEmpiresTwo(id,expansion, armyType,isFavorite)