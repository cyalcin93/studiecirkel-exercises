package com.hackosynth.week3.diamond

object Diamond {

    fun printToList(letter: Char): List<String> = ('A'..letter)
        .mapIndexed { i, c -> getLine(c, i, size = letter-'A') }

    private fun getLine(current: Char, index: Int, size: Int): String =
        " ".repeat(size-index) + getMiddlePart(current, size-2*(size-index)) + " ".repeat(size-index)


    private fun getMiddlePart(current: Char, spaces: Int) =
        if (current == 'A') current
        else current + " ".repeat(spaces) + current

}