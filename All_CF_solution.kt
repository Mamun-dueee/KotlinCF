//339A_Helpful_maths

fun main() {
    val inputString = readLine()!!

    // Example: Filter out the character '+'
    val filteredString = inputString.filter { it != '+' }

    //string -> list, then sort the list
    val strList = filteredString.toList().sorted()
    
    val result= strList.joinToString("+")
    println(result)
    
}


//281A_Word_Capitalization

fun main() {
    val word = readLine()!!

    // Capitalize the first letter
    val capitalizedWord = word.capitalize()

    println(capitalizedWord)
}


//236A Boy or Girl [set concept] [unique letters in a given word]

fun main() {
    val word = readLine()!!
    val uniqueLettersCount = word.toSet().size
    if(uniqueLettersCount % 2 == 0)
    	println("CHAT WITH HER!")
    else 
    	println("IGNORE HIM!")
}
