package com.helloworldstudios.todoappbackend.entities

import com.helloworldstudios.todoappbackend.core.entities.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.time.Instant
import java.util.*

@Entity
@Table(name = "tasks")
data class Task(
    val title: String,
    val description: String,
    @Column(name = "task_status")
    val taskStatus: Long,
    @Column(name = "due_date")
    val dueDate: Date
) : BaseEntity(){
    constructor() : this("title", "description", -1L, Date.from(Instant.now()))
}
