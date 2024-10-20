package com.helloworldstudios.todoappbackend.core.utilities.mapping

import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.CreateTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.DeleteTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.UpdateTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.CreatedTaskResponse
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.DeletedTaskResponse
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.UpdatedTaskResponse
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
    @Mapping(source = "taskStatus", target = "taskStatus")
    @Mapping(source = "dueDate", target = "dueDate")
    fun taskFromCreateTaskRequest(request: CreateTaskRequest): Task

    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "taskStatus", target = "taskStatus")
    @Mapping(source = "dueDate", target = "dueDate")
    fun createdTaskResponseFromTask(task: Task): CreatedTaskResponse

    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "taskStatus", target = "taskStatus")
    @Mapping(source = "dueDate", target = "dueDate")
    fun taskFromUpdateTaskRequest(request: UpdateTaskRequest): Task


    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "taskStatus", target = "taskStatus")
    @Mapping(source = "dueDate", target = "dueDate")
    fun updatedTaskResponseFromTask(task: Task): UpdatedTaskResponse

    @Mapping(source = "id", target = "id")
    fun tasFromDeleteTaskRequest(request: DeleteTaskRequest): Task

    @Mapping(source = "id", target = "id")
    fun deletedTaskResponseFromTask(task: Task): DeletedTaskResponse

}