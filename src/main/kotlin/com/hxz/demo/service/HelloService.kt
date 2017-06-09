package com.hxz.demo.service

import org.springframework.stereotype.Service

/**
 * @author hxz
 * @since 2017/06/09 16:25
 */
@Service
class HelloService {

    fun getHello(): String {
        return "hello service"
    }
}
