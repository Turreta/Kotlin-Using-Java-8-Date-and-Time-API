package com.turreta.kotlin.java.time

import java.time.LocalDate

/**
 * Created by Turreta.com on 17/6/2017.
 */
fun main(args: Array<String>) {

    var localDateNow: LocalDate = LocalDate.now()

    val localDate: LocalDate = LocalDate.of(2015, 6, 6)

    println("Current Date: " + localDateNow)
    println("Some Date:" + localDate)
}