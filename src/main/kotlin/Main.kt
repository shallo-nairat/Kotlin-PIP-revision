fun main() {

    var a = 20
    var b = 30
    println(a + b)
    println(a - b)
    println(a / b)
    println(a * b)
    println(a % b)

    val length = 90
    val width = 10
    val area = length * width
    println(area)


    val celsius = 20
    val fahrenheit =

        println()

   // val name = "nairat"
    //val age = 22
    //val favColor = "Blue"
    //println(name)
    //println(age)
    //println(favColor)

    val num1 = 50.0
    val num2 = 20.0
    val num3 = 10.0
    val average = (num1 + num2 + num3) / 3
    println(average)

    //Given an array of integers, find the sum of all the numbers

    // var numbers= arrayOf(200,400,50,60,80)
    //println(numbers.sum())

    //string concatination
   // val y = " Your school is "
    //val word = "Akirachix"
    //println(y + "" + word)

   // val year = 2000
    //var word = "Janet"
    //val sentence =" $word was born in $year"
    //println(sentence)

   // val word = "saw"
    //val year = 2019

    //val sentence = " I $word my mother in $year"
    //println(sentence)

    //trimming white spaces
    //val sentence = "   I study Kotlin and Javascript"
    //println(sentence.trimStart())

    //val sentence = "  I study at Akirachix "
    //println(sentence.trim())

    sentence("I have a book")
    name("Mary-Vivian is a girl from Kiambu and she is 23 years old")

printWord("I am from Moringa")
}

//write a function that takes in a String and return its length
 fun sentence (word: String) :Int{
     val result=word.length
    println(result)

    return result


 }
//write a function that extracts a substring from a iven string starting from index 7 to index 13
//using the slice function and return it
 fun name (word: String):String{
     val newName=(word.slice(7..13))
    println(newName)
    return newName

 }

//write a function thats takes in a word and prints out"welcome" when a word is passes to it,
//otherwise its prints out "your not welcome"

fun printWord(word: String) {
    if (word == "I am an akirachix") {


        println("Welcome")
    } else {
        println("you are not welcome")
    }
}
