package com.ilovebambi.novel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NovelApplication

fun main(args: Array<String>) {
    runApplication<NovelApplication>(*args)
}
