package com.example.sprintandroidoopchallenge.viewmodel

import com.example.sprintandroidoopchallenge.model.AgeOfEmpiresTwo

class AoETwoViewModel {

    private var aoeTwo: AgeOfEmpiresTwo = AgeOfEmpiresTwo("","","","")

    fun getCivilization(): String?{
        return aoeTwo.civil.civilizations.id
    }

    fun getUnit():String?{
        return aoeTwo.units.unit.id
    }

    fun getStructure():String?{
        return aoeTwo.structures.structure.id
    }

    fun getTech(): String?{
        return aoeTwo.technologies.technology.id
    }
}