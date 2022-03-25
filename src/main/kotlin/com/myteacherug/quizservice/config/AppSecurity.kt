package com.myteacherug.quizservice.config

import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
class AppSecurity {

    @Bean
    fun securityWebFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain {
        return http.cors().and().csrf().disable()
            .formLogin().disable()
            .httpBasic().disable()
            .authorizeExchange()
            .anyExchange().permitAll()
            .and().build()
    }
}
