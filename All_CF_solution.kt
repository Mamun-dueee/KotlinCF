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


//266A Stone on the table 

fun main() {
    val n = readLine()
    val str = readLine()!!
    val strList = str.toList()
    var result = 0

    for(i in 0..strList.size-2){
        if(strList[i]==strList[i+1])
            result ++
    }
    println(result)

}


//791A Bear and big Brother [implementation ] 

fun main() {
    val line = readln().split(" ").toList()
    var a = line[0].toInt()
    var b = line[1].toInt()

    var years = 0
    while(true){
        if(a>b)
            break
        else
            years++
        a = a*3
        b = b*2
    }
    println(years)

}


//617A - Elephant [math]

fun main() {
    val x = readln().toInt()
    var result = 0
    var mod = 0

    result += x / 5
    mod = x % 5
    result += mod / 4
    mod = mod % 4
    result += mod / 3
    mod = mod % 3
    result += mod / 2
    mod = mod % 2
    result += mod / 1
    mod = mod % 1

    println(result)

}


//546A Soldier and bananas [ brute force, math ]

fun main() {
    val str = readln() 
    val nums = str.split(" ").toList()
    
    var k = nums[0].toInt()
    var n = nums[1].toInt()
    var w = nums[2].toInt()
    var dollars = 0
    
    for ( i in 1..w){
        dollars += k*i
        
    }
    if( dollars > n)
        println(dollars-n)
    else 
        println(0)
    
}