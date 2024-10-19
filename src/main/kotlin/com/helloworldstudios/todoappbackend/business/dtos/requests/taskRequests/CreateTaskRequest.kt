package com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests

import java.util.*

data class CreateTaskRequest(
    val title: String,
    val description: String,
    val taskStatus: Long,
    val dueDate: Date
)