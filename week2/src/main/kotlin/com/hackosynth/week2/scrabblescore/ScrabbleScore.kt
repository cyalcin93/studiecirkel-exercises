package com.hackosynth.week2.scrabblescore

object ScrabbleScore {
<<<<<<< HEAD

    fun scoreWord(word: String): Int {
        var score = 0
        word.toCharArray().forEach {
            when(it.toUpperCase()) {
                'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> score++
                'D', 'G' -> score+=2
                'B', 'C', 'M', 'P' -> score+=3
                'F', 'H', 'V', 'W', 'Y' -> score+=4
                'K' -> score+=5
                'J', 'X' -> score+=8
                'Q', 'Z' -> score+=10
            }
        }

        return score
    }


//    fun scoreWord(word: String): Int {
//        var score = 0
//        val onePointer = Regex("[^AEIOULNRSTaeioulnrst]+")
//        val twoPointer = Regex("[^DGdg]+")
//        val threePointer = Regex("[^BCMPbcmp]+")
//        val fourPointer = Regex("[^FHVWYfhvwy]+")
//        val fivePointer = Regex("[^Kk]+")
//        val eightPointer = Regex("[^JXjx]+")
//        val tenPointer = Regex("[^QZqz]+")
//
//        score += 1 * word.replace(onePointer, "").length
//        score += 2 * word.replace(twoPointer, "").length
//        score += 3 * word.replace(threePointer, "").length
//        score += 4 * word.replace(fourPointer, "").length
//        score += 5 * word.replace(fivePointer, "").length
//        score += 8 * word.replace(eightPointer, "").length
//        score += 10 * word.replace(tenPointer, "").length
//
//        return score
//    }
}