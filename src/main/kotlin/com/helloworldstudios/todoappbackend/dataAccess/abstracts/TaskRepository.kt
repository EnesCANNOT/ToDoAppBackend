package com.helloworldstudios.todoappbackend.dataAccess.abstracts

import com.helloworldstudios.todoappbackend.entities.Task
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository : JpaRepository<Task, Long> {
}