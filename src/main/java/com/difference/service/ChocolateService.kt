package com.difference.service

import com.difference.model.Chocolate
import com.difference.repository.ChocolateRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.ArrayList
import java.util.function.Consumer

/**
 * Created by aleksandrprendota on 05.08.17.
 */
@Service
class ChocolateService {

    @Autowired
    lateinit var chocolateRepository: ChocolateRepository;

    fun getAllChocolate() : List<Chocolate>{
        val chocolates = ArrayList<Chocolate>()
        chocolateRepository.findAll().forEach(Consumer<Chocolate> { chocolates.add(it) })
        return chocolates
    }

}