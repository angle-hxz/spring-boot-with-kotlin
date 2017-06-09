package com.hxz.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan
class SpringBootWithKotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootWithKotlinApplication::class.java, *args)
}
