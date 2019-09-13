package com.example.sprintandroidoopchallenge.model

data class AgeOfEmpiresTwo(val civilizations: MutableList<Civilization>,
                      val units: MutableList<Unit>,
                      val structures: MutableList<Structure>,
                      val technologies: MutableList<Technology>)

data class Civilization(val name: String, val id: Int)

data class Unit(val name: String, val id: Int)

data class Structure(val name: String, val id: Int)

data class Technology(val name: String, val id: Int)