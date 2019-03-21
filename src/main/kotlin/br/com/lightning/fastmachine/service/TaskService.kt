package br.com.lightning.fastmachine.service

import org.springframework.stereotype.Service

@Service
class TaskService {

    private fun externalClient(): String{
        Thread.sleep(400 * 2)
        return ""
    }

    private fun accessDatabase(): String{
        Thread.sleep(100 * 2)
        return "data"
    }

    fun process(): String{
        externalClient()
        accessDatabase()
        return "done"
    }
}