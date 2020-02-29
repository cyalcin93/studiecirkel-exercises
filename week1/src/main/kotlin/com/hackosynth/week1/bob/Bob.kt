package com.hackosynth.week1.bob

object Bob {

    /**
     * Returns bob's very well worded response to a given input.
     * @param input - the sentence spoken to bob
     * @return bob's response to the spoken sentence
     */
    fun hey(input: String): String = with(input.trim()) {
        if (matches("[^a-z]+?[A-Z][^a-z]+\\?\$".toRegex())) return "Calm down, I know what I'm doing!"
        if (matches("[^a-z]+?[A-Z][^a-z]+".toRegex())) return "Whoa, chill out!"
        if (matches(".+\\?\$".toRegex())) return "Sure."
        if (matches("^$".toRegex())) return "Fine. Be that way!"
        return "Whatever."
    }
}