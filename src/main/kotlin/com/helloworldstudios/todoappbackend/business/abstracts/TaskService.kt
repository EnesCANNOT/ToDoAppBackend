package com.helloworldstudios.todoappbackend.business.abstracts

import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.CreateTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.DeleteTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.UpdateTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.CreatedTaskResponse
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.DeletedTaskResponse
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.UpdatedTaskResponse

interface TaskService {
    fun createTask(request: CreateTaskRequest): CreatedTaskResponse
    fun updateTask(request: UpdateTaskRequest): UpdatedTaskResponse
    fun deleteTask(request: DeleteTaskRequest): DeletedTaskResponse
}