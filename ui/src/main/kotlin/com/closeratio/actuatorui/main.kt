package com.closeratio.actuatorui

import com.closeratio.actuatorui.components.App
import kotlinx.browser.document
import react.dom.render

fun main() {
    render(document.getElementById("root")) {
        child(App::class) {

        }
    }
}