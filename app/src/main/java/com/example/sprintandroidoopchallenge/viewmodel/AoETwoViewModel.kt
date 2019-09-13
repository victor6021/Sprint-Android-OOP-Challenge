package com.example.sprintandroidoopchallenge.viewmodel

import com.example.sprintandroidoopchallenge.model.AgeOfEmpiresTwo

class AoETwoViewModel {

    private var aoetwo: AgeOfEmpiresTwo = AgeOfEmpiresTwo("","","","")

    fun getCivilization(): String?{
        return aoetwo.civil.civilizations.id
    }

    fun getUnit():String?{
        return aoetwo.units.unit.id
    }

    fun getStructure():String?{
        return aoetwo.structures.structure.id
    }

    fun getTech(): String?{
        return aoetwo.technologies.technology.id
    }
}