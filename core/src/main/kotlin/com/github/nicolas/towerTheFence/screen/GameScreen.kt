package com.github.nicolas.towerTheFence.screen

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Image
import com.badlogic.gdx.utils.Scaling
import com.badlogic.gdx.utils.viewport.ExtendViewport
import ktx.app.KtxScreen
import ktx.log.logger

class GameScreen : KtxScreen {

    private val stage : Stage = Stage(ExtendViewport(16f,9f))
    private val texture : Texture = Texture("assets/graphics/player/Warrior_Blue.png")
    private val background : Texture = Texture("assets/graphics/map.png")

    override fun show() {
        log.debug { "Game screen show" }

        stage.addActor(
            Image(texture).apply {
                setPosition(1f, 1f)
                setSize(1f,1f)
                setScaling(Scaling.fill)
            }
        )
        stage.addActor(
            Image(background).apply {
                setPosition(0f,0f)
                setSize(16f,9f)
                setScaling(Scaling.fill)
            }
        )
    }

    companion object{
        private val log = logger<GameScreen>()
    }

    override fun resize(width: Int, height: Int) {
        stage.viewport.update(width, height, true)
    }

    override fun dispose() {
        stage.dispose()
        texture.dispose()
        background.dispose()
    }

    override fun render(delta: Float) {
        with(stage) {
            act(delta)
            draw()
        }
    }

    private fun test() {
        with(listOf(1,2,3,4,5,6)){
            log.debug { "${last()}" }
        }
        log.debug{"${listOf(1,2,3,4,5,6).last()}"}
    }
}
