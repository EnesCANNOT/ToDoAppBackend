package com.helloworldstudios.todoappbackend.business.abstracts

import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.CreateTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.CreatedTaskResponse

interface TaskService {
    fun createTask(request: CreateTaskRequest): CreatedTaskResponse
}