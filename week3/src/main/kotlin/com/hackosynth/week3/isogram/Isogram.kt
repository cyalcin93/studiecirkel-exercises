package com.hackosynth.week3.isogram

object Isogram {

    fun isIsogram(input: String): Boolean {
        if (input.isBlank()) return true
        val charsOnly = "[^\\s-]+".toRegex().findAll(input.toLowerCase()).map { it.value }.joinToString("")

        return charsOnly.toCharArray().distinct().joinToString(separator = "?", postfix = "?").toRegex().matches(charsOnly)
    }

}