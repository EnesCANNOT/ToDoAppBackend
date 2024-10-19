package com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests

import com.helloworldstudios.todoappbackend.core.entities.GeneralEnumClasses
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import java.util.*

data class CreateTaskRequest(
    val title: String,
    val description: String,
    @Enumerated(EnumType.STRING)
    val taskStatus: GeneralEnumClasses.TaskStatus,
    val dueDate: Date
)