package ru.ipimenov.composition.domain.usecases

import ru.ipimenov.composition.domain.entity.GameSettings
import ru.ipimenov.composition.domain.entity.Level
import ru.ipimenov.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
