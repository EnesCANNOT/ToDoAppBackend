package com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests

import com.helloworldstudios.todoappbackend.core.entities.GeneralEnumClasses
import java.util.*

data class CreateTaskRequest(
    val title: String,
    val description: String,
    val taskStatus: GeneralEnumClasses.TaskStatus,
    val dueDate: Date
)