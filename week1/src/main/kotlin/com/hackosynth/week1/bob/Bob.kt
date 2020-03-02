package com.hackosynth.week1.bob

object Bob {

    /**
     * Returns bob's very well worded response to a given input.
     * @param input - the sentence spoken to bob
     * @return bob's response to the spoken sentence
     */
    fun hey(input: String): String = with(input.trim()) {
        val isQuestionAndShouted = "[^a-z]+?[A-Z][^a-z]+\\?\$".toRegex()
        val isShouted = "[^a-z]+?[A-Z][^a-z]+".toRegex()
        val isSilent = "^$".toRegex()
        val isQuestion = ".+\\?\$".toRegex()

        return when {
            matches(isQuestionAndShouted) -> "Calm down, I know what I'm doing!"
            matches(isShouted) -> "Whoa, chill out!"
            matches(isSilent) -> "Fine. Be that way!"
            matches(isQuestion) -> "Sure."
            else -> "Whatever."
        }
    }

}
