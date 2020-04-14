package com.hackosynth.week3.diamond


object Diamond {

    fun printToList(letter: Char): List<String> = (('A'..letter) + (letter - 1 downTo 'A'))
        .map { getLine(letter, it) }

    private fun getLine(letter: Char, current: Char) =
        " ".repeat(letter - current) + getMiddlePart(current) + " ".repeat(letter - current)

    private fun getMiddlePart(current: Char) =
        if (current == 'A') "A" else current + " ".repeat((current-'A')*2 - 1) + current

}