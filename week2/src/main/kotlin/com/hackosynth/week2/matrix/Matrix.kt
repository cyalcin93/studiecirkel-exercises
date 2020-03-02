package com.hackosynth.week2.matrix


class Matrix(private val matrixAsString: String) {

    fun column(colNr: Int): List<Int> = getRows()
        .map { it[colNr-1].toInt() }

    fun row(rowNr: Int): List<Int> = getRows()[rowNr-1]
        .map { it.toInt() }

    private fun getRows() = matrixAsString
        .split("\\n".toRegex())
        .map {
            it.split(" ".toRegex()).filter { element -> element.isNotBlank() }
        }
}