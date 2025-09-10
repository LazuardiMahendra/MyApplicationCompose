package com.example.mycomposeaplication.repository

import com.example.mycomposeaplication.model.Hero
import com.example.mycomposeaplication.model.HeroesData

class HeroRepository {
    fun getHero(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHero(query: String): List<Hero> {
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }

}