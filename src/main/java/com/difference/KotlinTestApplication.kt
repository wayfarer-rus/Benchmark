package com.difference

import com.difference.kotlin.model.Chocolate
import com.difference.kotlin.service.ChocolateService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.time.Duration
import java.util.*

/**
 * Created by wayfarer on 20.08.17.
 */
@SpringBootApplication
open class KotlinTestApplication {

    @Autowired
    private val chocolateService: ChocolateService? = null

    @Throws(InterruptedException::class)
    private fun testKotlin(): Long {
        println("Test Kotlin started")
        Thread.sleep(1000)
        println("Wait while calculating results.")

        val before = System.nanoTime()
        var chocolates: List<Chocolate> = load()
        val after = System.nanoTime()
        println(chocolates)

        return (after - before)
    }

    private fun load(): List<Chocolate> {
        var chocolates: List<Chocolate> = ArrayList()

        for (i in 0..9999) {
            chocolates = chocolateService!!.getAllChocolate()
        }

        return chocolates
    }

    @Bean
    @Throws(InterruptedException::class)
    open fun testBench(): String {
        println("Warming up JVM...")
        load()
        println("JVM should be warmed up! Run performance test...")
        val nanos = testKotlin()
        // transform nanos to human-friendly time
        val duration = Duration.ofNanos(nanos);
        println("Kotlin finished collecting data in: " + duration)
        return "done!"
    }

    companion object {
        @Throws(Exception::class)
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(KotlinTestApplication::class.java, *args)
        }
    }
}