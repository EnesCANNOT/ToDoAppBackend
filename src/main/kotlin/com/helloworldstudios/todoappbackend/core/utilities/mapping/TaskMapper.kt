package com.helloworldstudios.todoappbackend.core.utilities.mapping

import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.CreateTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.CreatedTaskResponse
import com.helloworldstudios.todoappbackend.entities.Task
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.factory.Mappers

@Mapper
interface TaskMapper {
    companion object{
        val INSTANCE: TaskMapper = Mappers.getMapper(TaskMapper::class.java)
    }

    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "task_status", target = "task_status")
    @Mapping(source = "dueDate", target = "dueDate")
    fun taskFromCreateTaskRequest(request: CreateTaskRequest): Task

    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "task_status", target = "task_status")
    @Mapping(source = "dueDate", target = "dueDate")
    fun createdTaskResponseFromTask(task: Task): CreatedTaskResponse
}