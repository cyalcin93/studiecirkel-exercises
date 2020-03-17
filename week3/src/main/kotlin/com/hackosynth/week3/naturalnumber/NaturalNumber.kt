package com.hackosynth.week3.naturalnumber

import java.lang.RuntimeException

enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

object NaturalNumber {

    fun classify(naturalNumber: Int): Classification {
        require(naturalNumber > 0)

        val aliquotSum = aliquotSum(naturalNumber)

        return when {
            aliquotSum == naturalNumber -> Classification.PERFECT
            aliquotSum < naturalNumber -> Classification.DEFICIENT
            aliquotSum > naturalNumber -> Classification.ABUNDANT
            else -> throw RuntimeException()
        }
    }

    private fun aliquotSum(naturalNumber: Int): Int {
        var sum = 0
        val range = naturalNumber/2
        for (i in 1..range) {
            if (naturalNumber % i == 0)
                sum += i
        }

        return sum
    }
}