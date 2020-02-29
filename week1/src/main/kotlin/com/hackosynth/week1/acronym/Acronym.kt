package com.hackosynth.week1.acronym

object Acronym {
    /**
     * Generates an acronym form a given sentence
     * @return the acronym for the sentence
     */
//    fun generate(phrase: String): String = mapOf(
//        "Portable Network Graphics" to "PNG",
//        "Ruby on Rails" to "ROR",
//        "First In, First Out" to "FIFO",
//        "GNU Image Manipulation Program" to "GIMP",
//        "Complementary metal-oxide semiconductor" to "CMOS",
//        "Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me" to "ROTFLSHTMDCOALM",
//        "Something - I made up from thin air" to "SIMUFTA",
//        "Halley's Comet" to "HC",
//        "The Road _Not_ Taken" to "TRNT"
//    )[phrase] ?: error("acronym not found")

    fun generate(phrase: String): String =
        phrase.split(" ", "-")
            .filter { it.isNotBlank() } // for the consecutive delimiters problem
            .map {
                it.replace(Regex("[^A-Za-z]"), "")
                    .first()
                    .toUpperCase()
            }.joinToString(separator = "")
}