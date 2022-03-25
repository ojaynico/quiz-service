package com.myteacherug.quizservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class QuizServiceApplication

fun main(args: Array<String>) {
    runApplication<QuizServiceApplication>(*args)
}
