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