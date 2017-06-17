package com.turreta.kotlin.java.time

import java.time.LocalTime

/**
 * Created by Turreta.com on 17/6/2017.
 */
fun main(args: Array<String>) {

    // Current time
    var localTimeNow: LocalTime = LocalTime.now()

    // 8:30:10 AM
    val localTime: LocalTime = LocalTime.of(8, 30, 10)

    println("Current time: " + localTimeNow)
    println("Some time: " + localTime)
}