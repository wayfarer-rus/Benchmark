package com.difference.java.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by aleksandrprendota on 05.08.17.
 */

@Data
@Entity
@Table(name = "COOKIE")
public class Cookie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    public long id;

    @Column(name = "WIEGHT")
    public int weight;

    @Column(name = "TYPE")
    public String type;

    @Column(name = "CEREAL")
    public String sereal;

}
