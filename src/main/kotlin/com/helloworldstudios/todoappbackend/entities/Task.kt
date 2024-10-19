package com.helloworldstudios.todoappbackend.entities

import com.helloworldstudios.todoappbackend.core.entities.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "tasks")
data class Task(
    @Column(name = "title", nullable = false)
    var title: String,
    @Column(name = "description", nullable = true)
    var description: String?,
    @Column(name = "task_status", nullable = false)
    var taskStatus: Long,
    @Column(name = "due_date", nullable = true)
    var dueDate: Date?
) : BaseEntity(){
    constructor() : this("title", null, -1L, null)
}
