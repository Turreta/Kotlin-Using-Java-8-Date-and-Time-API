package com.turreta.kotlin.java.time

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period

/**
 * java.time.Period example in Kotlin
 *
 * @author Turreta.com
 */
fun main(args: Array<String>) {

    // specificDateTime = February 2, 2017 9:00 AM
    var specificDateTime: LocalDateTime = LocalDateTime.of(2017, 2, 1, 9, 0, 0 )

    println(specificDateTime)

    // specificDateTime - 5 days
    println(specificDateTime.minus(Period.ofDays(5)))

    // specifiDateOnly = July 4, 2020
    var specificDateOnly = LocalDate.of(2020, 7, 4)

    println(specificDateOnly)

    // specificDateOnly +  1 year
    println(specificDateOnly.plus(Period.ofDays(1)))

}