package com.hackosynth.week3.forth

import java.lang.RuntimeException

object Forth {
    fun evaluate(vararg line: String): List<Int> {
        val evalLine = line[0].toLowerCase()
        val stacks = evalLine.split("+", "-", "*", "/", "swap").map { it.split(" ").mapNotNull { num -> num.toIntOrNull() } }.dropLast(1)
        val operators = evalLine.split("[0-9\\s]+".toRegex()).filter { it.isNotEmpty() }
        if (stacks[0].size < 2) {
            throw RuntimeException()
        }

        var evaluatedStack = listOf<Int>()
        stacks.forEachIndexed {i, s ->
            run {
                evaluatedStack = exec(evaluatedStack + s, getMethod(operators[i]))
            }
        }
        return evaluatedStack
    }

    private fun getMethod(op: String) : (List<Int>) -> List<Int> = when(op) {
        "+" -> ::add
        "-" -> ::subtract
        "*" -> ::multiply
        "/" -> ::divide
        "swap" -> ::swap
        else -> throw RuntimeException()
    }

    private fun exec(list: List<Int>, method: (List<Int>) -> List<Int>) : List<Int> = method(list)

    private fun add(list: List<Int>) = listOf(list.reduce { acc, i -> acc + i })
    private fun subtract(list: List<Int>) = listOf(list.reduce { acc, i -> acc - i })
    private fun multiply(list: List<Int>) = listOf(list.reduce { acc, i -> acc * i })
    private fun divide(list: List<Int>) = listOf(list.reduce { acc, i -> acc / i })
    private fun swap(list: List<Int>): List<Int> =
        run {
            val highest = list.sorted().takeLast(2)
            var finalList = list.toMutableList()
            finalList[list.indexOf(highest[0])] = highest[1].also { finalList[list.indexOf(highest[1])] = highest[0] }
            finalList
        }
}