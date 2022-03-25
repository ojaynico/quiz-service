package com.myteacherug.quizservice.repository

import org.springframework.stereotype.Service

@Service
class QuizService() {

    suspend fun testQuiz(): String {
        return "Testing Works"
    }

}
