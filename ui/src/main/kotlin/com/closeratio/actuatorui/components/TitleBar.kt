package com.closeratio.actuatorui.components

import kotlinx.css.flexGrow
import materialui.components.appbar.appBar
import materialui.components.appbar.enums.AppBarPosition.absolute
import materialui.components.toolbar.toolbar
import materialui.components.typography.enums.TypographyColor
import materialui.components.typography.enums.TypographyVariant
import materialui.components.typography.typography
import materialui.styles.withStyles
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div

class TitleBar: RComponent<RProps, RState>() {

    companion object {

        fun render(rBuilder: RBuilder) = with (rBuilder) { styledComponent { } }

        private val styledComponent = withStyles(TitleBar::class, {
            "root" {
                flexGrow = 1.0
            }
            "grow" {
                flexGrow = 1.0
            }
        })
    }

    override fun RBuilder.render() {
        val rootStyle = props.asDynamic()["classes"]["root"] as String
        val growStyle = props.asDynamic()["classes"]["grow"] as String

        div(classes = rootStyle) {
            appBar {
                attrs {
                    position = absolute
                }

                toolbar {
                    typography {
                        attrs {
                            classes(growStyle)

                            variant = TypographyVariant.h6
                            color = TypographyColor.inherit
                        }
                        +"Actuator"
                    }
                }
            }
        }
    }

}