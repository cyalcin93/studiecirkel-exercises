package com.hackosynth.week2.cipher

data class Cipher(var key: String = randomKey()) {

    init {
        require(key.matches("[a-z]+".toRegex()))
    }

    companion object {
        fun randomKey(): String = (1..100).map { ('a'..'z').random() }.joinToString("")
    }

    fun encode(value: String): String = TODO()
    fun decode(value: String): String = TODO()
}