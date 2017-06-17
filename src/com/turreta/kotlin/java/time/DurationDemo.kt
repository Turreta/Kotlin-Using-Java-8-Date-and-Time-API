package com.turreta.kotlin.java.time

import java.time.Duration
import java.time.LocalDateTime

/**
 * java.time.Duration example in Kotlin
 *
 * @author Turreta.com
 */
fun main(args: Array<String>) {

    // specificDateTime = February 2, 2017 9:00 AM
    var specificDateTime: LocalDateTime = LocalDateTime.of(2017, 2, 1, 9, 0, 0 )

    println(specificDateTime)

    // specificDateTime + 5 days
    println(specificDateTime.plus(Duration.ofDays(5)))

}