package com.hackosynth.week2.cipher

data class Cipher(var key: String = randomKey()) {

    // makes a=0, b=1..z=25 -- 26 letters in alphabet
    private val charIntValues = key.toCharArray().map { getCharIntValue(it) }

    init {
        require(key.matches("[a-z]+".toRegex()))
    }

    companion object {
        fun randomKey(): String = (1..100).map { ('a'..'z').random() }.joinToString("")
    }

    fun encode(value: String): String = value
        .toCharArray()
        .mapIndexed { i, c -> getEncodedChar(c, i) }
        .joinToString("")

    fun decode(value: String): String = value
        .toCharArray()
        .mapIndexed { i, c -> getDecodedChar(c, i) }
        .joinToString("")


    private fun getCharIntValue(c: Char) = (c-97).toInt()
    private fun getIntCharValue(i: Int) = (i+97).toChar()

    private fun getEncodedChar(c: Char, i: Int): Char {
        val charIntValue = (getCharIntValue(c) + charIntValues[i % charIntValues.size]) % 26

        return getIntCharValue(charIntValue)
    }

    private fun getDecodedChar(c: Char, i: Int): Char {
        val charIntValue = (26 + (getCharIntValue(c) - charIntValues[i % charIntValues.size])) % 26

        return getIntCharValue(charIntValue)
    }

}