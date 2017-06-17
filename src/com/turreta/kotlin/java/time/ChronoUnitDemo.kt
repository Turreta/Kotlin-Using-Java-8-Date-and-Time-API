package com.turreta.kotlin.java.time

import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

/**
 * Created by Turreta.com on 17/6/2017.
 */
fun main(args: Array<String>) {

    // January 5, 2010 9:30:45 AM
    var startLocalDateTime: LocalDateTime = LocalDateTime.of(2010, 1, 5, 9, 30, 45)

    // June 6, 2015 8:30:10 AM
    val endLocalDateTime: LocalDateTime = LocalDateTime.of(2015, 6, 6, 8, 30, 10)

    println("Years: " + ChronoUnit.YEARS.between(startLocalDateTime, endLocalDateTime))

    println("Months: " + ChronoUnit.MONTHS.between(startLocalDateTime, endLocalDateTime))
    println("Weeks: " + ChronoUnit.WEEKS.between(startLocalDateTime, endLocalDateTime))
    println("Days: " + ChronoUnit.DAYS.between(startLocalDateTime, endLocalDateTime))
    println("Hours: " + ChronoUnit.HOURS.between(startLocalDateTime, endLocalDateTime))
    println("Minutes: " + ChronoUnit.MINUTES.between(startLocalDateTime, endLocalDateTime))
    println("Seconds: " + ChronoUnit.SECONDS.between(startLocalDateTime, endLocalDateTime))
    println("ms: " + ChronoUnit.MILLIS.between(startLocalDateTime, endLocalDateTime))
    println("ns: " + ChronoUnit.NANOS.between(startLocalDateTime, endLocalDateTime))
}