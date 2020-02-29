package com.hackosynth.week1.darts

import kotlin.math.sqrt

object Darts {
    /**
     * Given the x and y coordinates returns the score a dart landing there would yield
     * @param x - the X coordinate
     * @param y - the Y coordinate
     * @return the score the given coordinates would yield
     */
    fun score(x: Number, y: Number): Int =  when {
        getRadius(x, y) <= 1.0 -> 10
        getRadius(x, y) <= 5.0 -> 5
        getRadius(x, y) <= 10.0 -> 1
        else -> 0
    }

    // Uses Pythagoras theorem to retrieve the radius
    private fun getRadius(x: Number, y: Number) = sqrt(x.toDouble()*x.toDouble() + y.toDouble()*y.toDouble())

}