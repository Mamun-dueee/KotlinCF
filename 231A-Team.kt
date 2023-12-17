fun main(){
    val userInput: Int = readLine()?.toIntOrNull() ?: 0
    var itCount: Int = userInput
    var total: Int = 0
    while (itCount > 0){
        val str: String? = readLine()
        val words: List<String> = str?.split(" ") ?: emptyList()
        val sumOfWords = words.mapNotNull{ it.toIntOrNull() }.sum()
        //println(sumOfWords)
        if (sumOfWords >= 2)
            total ++
        itCount--
    }
    println(total)
}
