package com.closeratio.actuatorui

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ActuatorUiApplication

fun main(args: Array<String>) {
	runApplication<ActuatorUiApplication>(*args)
}
