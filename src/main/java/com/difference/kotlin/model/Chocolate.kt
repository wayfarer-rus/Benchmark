package com.difference.kotlin.model

import javax.persistence.*;

/**
 * Created by aleksandrprendota on 05.08.17.
 */
@Entity
@Table(name = "CHOCOLATE")
class Chocolate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    var id: Long = 0

    @Column(name = "NAME")
    var name: String? = null

    @Column(name = "WIEGHT")
    var weight: Int = 0

    @Column(name = "TYPE")
    var type: String? = null

}