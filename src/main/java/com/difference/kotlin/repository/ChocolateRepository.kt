package com.difference.kotlin.repository

import com.difference.kotlin.model.Chocolate
import org.springframework.data.repository.CrudRepository

/**
 * Created by aleksandrprendota on 05.08.17.
 */
interface ChocolateRepository : CrudRepository<Chocolate, Long> {}
