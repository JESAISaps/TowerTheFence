package com.github.nicolas.towerTheFence

import com.badlogic.gdx.Application
import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.github.nicolas.towerTheFence.screen.GameScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen

class TowerTheFence : KtxGame<KtxScreen>(){

    override fun create() {
        Gdx.app.logLevel = Application.LOG_DEBUG
        addScreen(GameScreen())
        setScreen<GameScreen>() // Calls show method from GameScreen
    }

    override fun render() {
        super.render()
    }
}
