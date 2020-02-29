package com.hackosynth.week1.bob

object Bob {

    /**
     * Returns bob's very well worded response to a given input.
     * @param input - the sentence spoken to bob
     * @return bob's response to the spoken sentence
     */
    fun hey(input: String): String = with(input.trim()) {
        return when {
            matches("[^a-z]+?[A-Z][^a-z]+\\?\$".toRegex()) -> "Calm down, I know what I'm doing!"
            matches("[^a-z]+?[A-Z][^a-z]+".toRegex()) -> "Whoa, chill out!"
            matches("^$".toRegex()) -> "Fine. Be that way!"
            matches(".+\\?\$".toRegex()) -> "Sure."
            else -> "Whatever."
        }
    }
}
