package com.helloworldstudios.todoappbackend.entities

import com.helloworldstudios.todoappbackend.core.entities.BaseEntity
import com.helloworldstudios.todoappbackend.core.entities.GeneralEnumClasses
import jakarta.persistence.*
import java.time.Instant
import java.util.*

@Entity
@Table(name = "tasks")
data class Task(
    val title: String,
    val description: String,
    @Column(name = "task_status")
    @Enumerated(EnumType.STRING)
    val taskStatus: GeneralEnumClasses.TaskStatus,
    @Column(name = "due_date")
    val dueDate: Date
) : BaseEntity(){
    constructor() : this("title", "description", GeneralEnumClasses.TaskStatus.TODO, Date.from(Instant.now()))
}
