package com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses

import com.helloworldstudios.todoappbackend.core.entities.GeneralEnumClasses
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import java.util.*

data class CreatedTaskResponse(
    val id: Long,
    val title: String,
    val description: String,
    @Enumerated(EnumType.STRING)
    val taskStatus: GeneralEnumClasses.TaskStatus,
    val dueDate: Date,
)