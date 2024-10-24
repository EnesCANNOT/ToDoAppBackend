package com.helloworldstudios.todoappbackend.api.controllers.task

import com.helloworldstudios.todoappbackend.business.abstracts.TaskService
import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.CreateTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.DeleteTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.requests.taskRequests.UpdateTaskRequest
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.CreatedTaskResponse
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.DeletedTaskResponse
import com.helloworldstudios.todoappbackend.business.dtos.responses.taskResponses.UpdatedTaskResponse
import lombok.AllArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@AllArgsConstructor
@RequestMapping("/api/task")
class TaskController {

    @Autowired
    private lateinit var taskService: TaskService

    @PostMapping("/create")
    fun createTask(@RequestBody request: CreateTaskRequest): CreatedTaskResponse {
        return taskService.createTask(request)
    }

    @PostMapping("/update")
    fun updateTask(@RequestBody request: UpdateTaskRequest): UpdatedTaskResponse {
        return taskService.updateTask(request)
    }

    @PostMapping("/delete")
    fun deleteTask(@RequestBody request: DeleteTaskRequest): DeletedTaskResponse {
        return taskService.deleteTask(request)
    }
}