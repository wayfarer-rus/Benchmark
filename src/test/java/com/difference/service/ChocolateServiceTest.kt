package com.difference.service

import com.difference.model.Chocolate
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.ArrayList

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
        var chocolates: List<Chocolate> = ArrayList()
        val before = System.nanoTime()
        for (i in 0..9999) {
            chocolates = chocolateService.getAllChocolate()
        }
        val after = System.nanoTime()
        print("Метод Kotlin работал ${after - before}")
        print(chocolates)

        /*
        t = ns.

        cold:
        113423870
        36801600
        56001870
        52245214
        43360061

        hot:
        42216163032
        42427334741
        46307873530
        48732917906
        48637057933
        60357532444

        hot and sout:
        40259650885
        43031394212
        40530155530
        42350677182
        41460578251
        40447572957
        43159528844
         */
    }
}