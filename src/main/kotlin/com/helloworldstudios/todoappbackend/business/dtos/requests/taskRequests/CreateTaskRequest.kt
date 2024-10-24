package com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class CreateTaskRequest(
    val title: String,
    val description: String,
    val taskStatus: Long,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    val dueDate: LocalDateTime
)