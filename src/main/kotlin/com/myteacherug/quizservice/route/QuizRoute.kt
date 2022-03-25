package com.myteacherug.quizservice.route

import com.myteacherug.quizservice.repository.QuizService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.*

@Configuration
class QuizRoute {

    @Bean
    fun quizRoutes(quizService: QuizService) = coRouter {
        "/quiz".nest {
            GET("/test") {
                ServerResponse.ok().bodyValueAndAwait(quizService.testQuiz())
            }
        }
    }
}
