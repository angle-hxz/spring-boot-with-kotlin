package com.hxz.demo.controller

import com.hxz.demo.entity.HelloDto
import com.hxz.demo.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author hxz
 * @since 2017/06/09 15:30
 */
@RestController
class IndexController(){
    @Autowired
    lateinit var helloService : HelloService

    @GetMapping("hello")
    fun index():String{
        return "hello world !"
    }

    @GetMapping("/hello-service")
    fun helloKotlinService(): String {
        return helloService.getHello()
    }

    @GetMapping("/hello-dto")
    fun helloDtd() : HelloDto{
        return HelloDto("Hello from the dto")
    }
}