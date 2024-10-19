package com.helloworldstudios.todoappbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ToDoAppBackendApplication

fun main(args: Array<String>) {
    runApplication<ToDoAppBackendApplication>(*args)
}
