package com.hackosynth.week2.spaceage

class SpaceAge(private val ageSeconds: Long) {

    fun onEarth(): Double = getNumberOfYears(31557600.0)
    fun onMercury(): Double = getNumberOfYears(31557600.0 * 0.2408467)
    fun onVenus(): Double = getNumberOfYears(31557600.0 * 0.61519726)
    fun onMars(): Double = getNumberOfYears(31557600.0 * 1.8808158)
    fun onJupiter(): Double = getNumberOfYears(31557600.0 * 11.862615)
    fun onSaturn(): Double = getNumberOfYears(31557600.0 * 29.447498)
    fun onUranus(): Double = getNumberOfYears(31557600.0 * 84.016846)
    fun onNeptune(): Double = getNumberOfYears(31557600.0 * 164.79132)

    private fun getNumberOfYears(secondsInAYear: Double) = "%.2f".format(ageSeconds/secondsInAYear).toDouble()
}