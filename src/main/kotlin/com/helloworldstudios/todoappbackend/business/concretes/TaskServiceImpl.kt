package com.helloworldstudios.todoappbackend.business.concretes

import com.helloworldstudios.todoappbackend.business.abstracts.TaskService
import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.CreateTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.DeleteTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.UpdateTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.CreatedTaskResponse
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.DeletedTaskResponse
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.UpdatedTaskResponse
import com.helloworldstudios.todoappbackend.core.utilities.mapping.TaskMapper
import com.helloworldstudios.todoappbackend.dataAccess.abstracts.TaskRepository
import com.helloworldstudios.todoappbackend.entities.Task
import lombok.AllArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Instant
import java.util.*
import kotlin.jvm.optionals.getOrNull

@Service
@AllArgsConstructor
class TaskServiceImpl : TaskService {

    @Autowired
    private lateinit var taskRepository: TaskRepository

    override fun createTask(request: CreateTaskRequest): CreatedTaskResponse {
        val task: Task = TaskMapper.INSTANCE.taskFromCreateTaskRequest(request)
        val createdTask = taskRepository.save(task)
        val createdTaskResponse: CreatedTaskResponse = TaskMapper.INSTANCE.createdTaskResponseFromTask(createdTask)
        return createdTaskResponse
    }

    override fun updateTask(request: UpdateTaskRequest): UpdatedTaskResponse {
        // TODO(Check id exist and return message)

        val foundTask: Task? = taskRepository.findById(request.id).getOrNull()
        if (foundTask != null) {
            val task: Task = TaskMapper.INSTANCE.taskFromUpdateTaskRequest(request)
            val updatedTask: Task = taskRepository.save(task)
            val updatedTaskResponse: UpdatedTaskResponse = TaskMapper.INSTANCE.updatedTaskResponseFromTask(updatedTask)
            return updatedTaskResponse
        }

        throw RuntimeException("Task not found!")
    }

    override fun deleteTask(request: DeleteTaskRequest): DeletedTaskResponse {
        // TODO(Check id exist and return message)

        val foundTask: Task? = taskRepository.findById(request.id).getOrNull()
        if (foundTask != null) {
            val task: Task = TaskMapper.INSTANCE.tasFromDeleteTaskRequest(request)
            task.deletedDate = Date.from(Instant.now())
            val deletedTask = taskRepository.save(task)
            val deletedTaskResponse: DeletedTaskResponse = TaskMapper.INSTANCE.deletedTaskResponseFromTask(deletedTask)
            return deletedTaskResponse
        }

        throw RuntimeException("Task not found!")
    }
}