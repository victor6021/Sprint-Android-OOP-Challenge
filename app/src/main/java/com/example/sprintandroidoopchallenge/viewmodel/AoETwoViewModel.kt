package com.example.sprintandroidoopchallenge.viewmodel

import com.example.sprintandroidoopchallenge.model.AgeOfEmpiresTwo

class AoETwoViewModel {

    private var aoetwo: AgeOfEmpiresTwo = AgeOfEmpiresTwo("","","","")

    fun getCivilization(): String?{
        return aoetwo.civil
    }

    fun getUnit():String?{
        return aoetwo.unit
    }

    fun getStructure():String?{
        return aoetwo.structure
    }

    fun getTech(): String?{
        return aoetwo.technology
    }
}