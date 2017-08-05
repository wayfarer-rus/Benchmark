package com.difference.repository

import com.difference.model.Chocolate
import org.springframework.data.repository.CrudRepository

/**
 * Created by aleksandrprendota on 05.08.17.
 */
interface ChocolateRepository : CrudRepository<Chocolate, Long> {}
