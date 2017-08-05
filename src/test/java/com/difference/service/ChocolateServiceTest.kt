package com.difference.service

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * Created by aleksandrprendota on 05.08.17.
 */
@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class ChocolateServiceTest {

    @Autowired
    lateinit var chocolateService: ChocolateService

    @Test
    fun testFindAllChocolate(){
        Assert.assertTrue(chocolateService.getAllChocolate().isNotEmpty())
    }
}