package com.turreta.kotlin.java.time

import java.time.LocalDateTime

/**
 * Created by Turreta.com on 17/6/2017.
 */
fun main(args: Array<String>) {

    // Current date/time
    var localDateTimeNow: LocalDateTime = LocalDateTime.now()

    // June 6, 2015 8:30:10 AM
    val localDateTime: LocalDateTime = LocalDateTime.of(2015, 6, 6, 8, 30, 10)

    println("Current Date/time: " + localDateTimeNow)
    println("Some Date/time: " + localDateTime)
}