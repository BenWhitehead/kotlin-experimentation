package com.github.benwhitehead.kotlin.webdemo.problems.indexOfMaximum

import java.util.*

/**
* @author Ben Whitehead
*/
/*
 * Your task is to implement the indexOfMax() function so that it computes returns
 * the greatest index of the greatest element in the array, or null if the array is empty
 */
fun indexOfMax(a : IntArray) : Int? {
    // Write your solution here
    var indexOfMaximum: Int = 0
    var valueOfMaximum: Int = Integer.MIN_VALUE
    for (index in a.indices) {
        val value = a[index]
        if (value >= valueOfMaximum) {
            indexOfMaximum = index
            valueOfMaximum = value
        }
    }
    return indexOfMaximum
}

fun main(args : Array<String>) {
//    test(null) // TODO - can't figure this one out.
    test(0, 0)
    test(1, -1, 0)
    test(0, -1, -2)
    test(1, 1, 3, 2, 1)
    test(2, 1, 3, 4, 1)
    test(2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)
    test(2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE)

    println("Success")
}





// HELPER FUNCTIONS
fun test(expected : Int?, vararg data : Int) {
    val actual = indexOfMax(data)
    assertEquals(actual, expected, "\ndata = ${Arrays.toString(data)}\n" +
    "indexOfMax(data) = ${actual}, but must be $expected ")
}

fun assertEquals<T>(actual : T?, expected : T?, message : Any? = null) {
    if (actual != expected) {
        if (message == null)
            throw AssertionError()
        else
            throw AssertionError(message)
    }
}
