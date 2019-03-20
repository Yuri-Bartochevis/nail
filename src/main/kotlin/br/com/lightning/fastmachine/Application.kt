package br.com.lightning.fastmachine

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener

@SpringBootApplication
class Application {


    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }

        @EventListener(ApplicationReadyEvent::class)
        fun run() {

            val runtime = Runtime.getRuntime()

            val processors = runtime.availableProcessors()
            val maxMemory = runtime.maxMemory()

            System.out.format("Number of processors: %d\n", processors)
            System.out.format("Max memory: %d bytes\n", maxMemory)
        }

}