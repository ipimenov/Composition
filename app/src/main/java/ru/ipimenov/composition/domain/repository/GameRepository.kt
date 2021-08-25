package ru.ipimenov.composition.domain.repository

import ru.ipimenov.composition.domain.entity.GameSettings
import ru.ipimenov.composition.domain.entity.Level
import ru.ipimenov.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}