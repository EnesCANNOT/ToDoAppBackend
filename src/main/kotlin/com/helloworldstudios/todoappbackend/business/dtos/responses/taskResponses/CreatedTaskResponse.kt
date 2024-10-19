package com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses

import java.util.*

data class CreatedTaskResponse(
    val id: Long,
    val title: String,
    val description: String,
    val taskStatus: Long,
    val dueDate: Date,
)