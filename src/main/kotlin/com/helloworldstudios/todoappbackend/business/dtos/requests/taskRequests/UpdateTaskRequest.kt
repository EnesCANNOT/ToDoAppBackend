package com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests

import java.util.*

data class UpdateTaskRequest(
    val id: Long,
    val title: String,
    val description: String,
    val taskStatus: Long,
    val dueDate: Date
)