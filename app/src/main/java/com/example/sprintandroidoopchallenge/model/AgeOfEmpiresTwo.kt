package com.example.sprintandroidoopchallenge.model

open class AgeOfEmpiresTwo(val id: String,val name: String, val expansion: String, val isFavorite: Boolean) {
    val returnTypeInfo = "$id, $expansion"
    open fun type(): String {
        return returnTypeInfo
    }
}
class Civilization(id: String, name: String, expansion: String, isFavorite: Boolean): AgeOfEmpiresTwo(id, name,expansion,isFavorite) {

    override fun type(): String {
        return "$id, $name, $expansion"
    }
}

class Unit(id: String, name: String, expansion: String, isFavorite: Boolean): AgeOfEmpiresTwo(id, name, expansion,isFavorite) {

    override fun type(): String {
        return "$id, $name,$expansion"
    }
}

class Structure(id: String, name: String, expansion: String, isFavorite: Boolean): AgeOfEmpiresTwo(id, name, expansion, isFavorite) {

    override fun type(): String {
        return "$id, $name, $expansion"
    }
}

class Technology(id: String, name: String, expansion: String, isFavorite: Boolean): AgeOfEmpiresTwo(id, name, expansion, isFavorite) {

    override fun type(): String {
        return "$id, $name, $expansion"
    }
}