@file:JvmName("Lwjgl3Launcher")

package com.github.nicolas.towerTheFence.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.github.nicolas.towerTheFence.TowerTheFence

/** Launches the desktop (LWJGL3) application. */
fun main() {
    // This handles macOS support and helps on Windows.
    if (StartupHelper.startNewJvmIfRequired())
      return
    Lwjgl3Application(TowerTheFence(), Lwjgl3ApplicationConfiguration().apply {
        setTitle("TowerTheFence")
        setWindowedMode(800, 500)
        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
        useVsync(true)
    })
}
