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


//110A. Nearly Lucky Number [implementation]

fun main() {
    val inputLine = readln()
    
    var luckyDigitCount = inputLine.count{it=='4'}
    luckyDigitCount += inputLine.count{ it == '7'}
    
    if(luckyDigitCount == 4 || luckyDigitCount == 7)
    	println("YES")
    else
    	println("NO")
}


//734A. Anton and Danik [implementation, strings]

fun main() {
    val input = readln()
    val inputLine = readln()
    
    var antonWon = inputLine.count{it=='A'}
	var danikWon = inputLine.count{ it == 'D'}    
    
    if(antonWon > danikWon)
    	println("Anton")
    else if(antonWon < danikWon)
    	println("Danik")
    else
    	println("Friendship")
}

//41A. Translation [implementation, strings]

fun main() {
    val berland = readln()
    val birland = readln()
    if(berland == birland.reversed())
    	println("YES")
    else
    	println("NO")
}

//116A. Tram [ implementation ] 

fun main() {
    val n = readln().toInt()
    var capacity = 0
    var highCapacity = 0

    for (i in 1..n){
        val input = readln().split(" ")
        val inputList = input.toList()
        val a = inputList[0].toInt()
        val b = inputList[1].toInt()

        capacity = capacity -a+b
        if(capacity > highCapacity)
            highCapacity = capacity



    }
    println(highCapacity)
}


//677A. Vanya and Fence [implementation]

fun main() {
    val input = readln().split(" ").toList()
    val n = input[0].toInt()
    val h = input[1].toInt()

    //println(n)

    val inputHeight = readln().split(" ").toList()
    val a = inputHeight.mapNotNull { it.toInt() }
    //println(a)

    var width = 0

    for (i in 0..n-1){
        if(a[i] > h)
            width += 2
        else
            width ++
    }
    println(width)
}

//271A. Beautiful Year

fun main() {
    val y = readln()
    var yInt = y.toInt()
    
    while(true){
        yInt ++
        val dy = yInt.toString().toSet()
    	
        if(dy.size == y.length){
            
            println(dy.joinToString(""))
            break
        }
    }
    
}

//266B. Queue at the School

fun main(){
    val input = readln().split(" ").toList()
    val n = input[0].toInt()
    val t = input[1].toInt()

    val s = readln()
    var a = s
    for (i in 1..t){
        a = a.replace("BG", "GB")
    }
    println(a)
}

//1030A - In Search of an Easy Problem

fun main() {
    val n = readln()
    val s = readln()
    if(s.contains('1'))
    	println("HARD")
    else
    	println("EASY")
}

//467A - George and Accommodation

fun main(){
    val n = readln().toInt()
    var result = 0

    for(i in 1..n){
        val s = readln().split(" ").toList()
        val p = s[0].toInt()
        val q = s[1].toInt()

        val x = q-p
        if(x >= 2){
            result ++
        }
    }
    println(result)
}

//344A. Magnets

fun main(){
    val n = readln().toInt()
    var s = readln().toList()
    var prePole = s[1]
    var group = 1

    for (i in 1..n-1){
        var ss = readln().toList()

        if(prePole == ss[0])
            group ++
        prePole = ss[1]

    }
    println(group)
}


//144A. Arrial of the General 

// comment..........................................,............................
// 
// /*
fun main() {
    val n = readln().toInt()
    val line = readln().split(" ").map{ it.toInt() }
    var result = 0
    
    val min_height = line.minOrNull()
    val max_height = line.maxOrNull()
    
    val min_last_index = line.lastIndexOf(min_height)
    val max_first_index = line.indexOf(max_height)
    
    if(max_first_index < min_last_index){
        result = max_first_index + n - 1 - min_last_index
        
    } else {
        result = max_first_index + n - 1 - min_last_index -1
    }
    
    println(result)
    
    /*
    val numbers = listOf(5, 2, 10,1, 8, 1, 7, 3, 10)

    val minValue = numbers.minOrNull()
    val maxValue = numbers.maxOrNull()

    val minIndex = numbers.lastIndexOf(minValue)
    val maxIndex = numbers.indexOf(maxValue)

    println(numbers.size)
    println("Minimum value: $minValue at index $minIndex")
    println("Maximum value: $maxValue at index $maxIndex")
    */
}


//520A. Pangram

fun main() {
    val alphabet = ('a'..'z').toSet()
    //println(alphabet.size) 
   
    val n = readln()
    val input = readln().toLowerCase()
  
    val characters = input.toCharArray().toSet()
    //println(characters.size)
    //println(characters)
    
    if ( alphabet.size == characters.size ){
        println("YES")
    } else {
        println("NO")
    }
}

// 148A. Insomnia cure


fun main(){
    val k = readln().toInt()
    val l = readln().toInt()
    val m = readln().toInt()
    val n = readln().toInt()
    
    val d = readln().toInt()
    
    var dragons = 0
    
    for(i in 1..d){
        if( i%k == 0 || i%l == 0 || i%m == 0 || i%n == 0)
            dragons ++
    }
    println(dragons)
    
}


//443A. Anton and Letters

fun main(){
    val str = readln()
    //println(str.substring(1, str.length-1))
    val strFil = str.substring(1, str.length-1)
    //println(strFil.length)
    val strLetters = strFil.split(", ").toSet()
    //println(strLetters)
    //println(strLetters is Set)
    if (strFil.length == 0)
        println(strFil.length)
    else
        println(strLetters.size)
}