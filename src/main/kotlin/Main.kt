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
  //  myName("Nairat")
   // age(23)
    mySchool("akirachix")

    factsAboutMe("I love food")
    myText("   she  is young  and joy ")
    bestSchool("Bahari Girls","Kilifi")

    //Arrays
//create an array of students and get the third index
     var students= arrayOf("Nairat","Shee","Caren","Tracy","Hawa")
    println(students[3])

    //replace the fourth name with "Faith" in the above array
    students[4]="Faith"
    println(students.contentToString())

    //find the size of the array
    println(students.count())

    // add an element to the above array
    students=students.plus("Christine" )
    println(students.contentToString())

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
    println(word.last())
}

//fun myName(mystring:String){
    //println(mystring.last())
    //val sentence ="hello my name is $name"
    //return sentence
//
//}
//fun age(age:Int):Int{
//  val a =age
////    return ++a

fun mySchool(word: String){
    println(word.split(","))
}

//create and invoke a function that prints out interesting fact about yourself
fun factsAboutMe(word: String){
    println(word)
}

//create a function that takes in a string and returns a new string with all spaces removed
 fun myText(text:String):String{
    val newmyText=(text.trim())
     println(newmyText)
    return newmyText

}
//write a function taking in parameters, school and place and return a string with the sentence 'The best school is x and its located in y
// where x and y are provided respectively

fun bestSchool(school:String, place:String){
    val sentence=( "The best school is$school and its located in $place")
    println(sentence)
}

//Arrays
//create an array of students and get the third index

