package com.helloworldstudios.todoappbackend.business.concretes

import com.helloworldstudios.todoappbackend.business.abstracts.TaskService
import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.CreateTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.CreatedTaskResponse
import com.helloworldstudios.todoappbackend.core.utilities.mapping.TaskMapper
import com.helloworldstudios.todoappbackend.dataAccess.abstracts.TaskRepository
import com.helloworldstudios.todoappbackend.entities.Task
import lombok.AllArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

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
}