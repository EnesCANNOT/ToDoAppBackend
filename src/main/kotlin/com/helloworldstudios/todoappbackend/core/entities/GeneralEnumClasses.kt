package com.helloworldstudios.todoappbackend.core.entities

class GeneralEnumClasses {
    enum class TaskStatus(val value: String) {
        TODO(value = "To Do"),
        IN_PROGRESS(value = "In Progress"),
        COMPLETED(value = "Completed"),
    }
}