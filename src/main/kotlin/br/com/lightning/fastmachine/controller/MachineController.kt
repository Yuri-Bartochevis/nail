package br.com.lightning.fastmachine.controller

import br.com.lightning.fastmachine.service.TaskService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class MachineController(val taskService: TaskService) {

    @RequestMapping("/")
    fun home(): String {
        return "Welcome to Docker apis"
    }

    @RequestMapping("/process")
    fun process(): String {
        print("receiving request at thread : ${ println(Thread.currentThread().name)}")
        return taskService.process()
    }
}