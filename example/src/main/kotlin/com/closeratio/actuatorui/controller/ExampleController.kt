package com.closeratio.actuatorui.controller

import com.closeratio.actuatorui.controller.response.GenerateRandomNumberResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
@RequestMapping("/example")
class ExampleController {

    @GetMapping("/random")
    fun generateRandomNumber() : GenerateRandomNumberResponse = GenerateRandomNumberResponse(
        Random.nextDouble()
    )

}