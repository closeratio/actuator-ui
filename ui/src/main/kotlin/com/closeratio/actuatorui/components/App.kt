package com.closeratio.actuatorui.components

import materialui.styles.createMuiTheme
import materialui.styles.muitheme.MuiTheme
import materialui.styles.themeprovider.themeProvider
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div

class App: RComponent<RProps, RState>() {

    override fun RBuilder.render() {

        themeProvider(theme) {
            div {
                TitleBar.render(this)
            }
        }
    }

    companion object {
        private val theme: MuiTheme = createMuiTheme {

        }
    }

}