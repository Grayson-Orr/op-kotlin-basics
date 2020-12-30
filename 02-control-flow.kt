/*==================================================
Conditional expressions
==================================================*/

// In Kotlin, there is no ternary operator :(
fun max(x: Int, y: Int) = if (x > y) x else y

/*==================================================
When
==================================================*/
fun greeting(country: String) {
  when (country) {
    "China" -> println("你好")
    "Italy" -> println("Ciao")
    "Japan" -> println("こんにちは")
    "Russia" -> println("Здравствуйте")
    else -> println("Unknown greeting")
  }   
}

fun eatASteak() = println("I am eating a steak!")

fun cookASteak() = println("I am cooking a steak!")

fun main() {
  println(max(50, 10))

  /*==================================================
  Loops
  ==================================================*/
  val countries = listOf("Australia", "Brazil", "Canada")
  for (country in countries) println(country)

  var steaksEaten = 0
  var steaksCooked = 0
    
  // While & do-while work the same as most modern programming languages
  while (steaksEaten < 5) { // While the condition is true, execute the block
    eatASteak()
    steaksEaten++
  }
  
  do { // Execute the block & then check the condition
    cookASteak()
    steaksCooked++
  } while (steaksCooked < steaksEaten)

  /*==================================================
  Ranges
  ==================================================*/
  for(i in 0..10) print(i)
  println("")
  for(i in 0 until 5) print(i)
  println("")
  for(i in 2..10 step 2) print(i)
  println("")
  for (i in 5 downTo 0) print(i)
  println("")

  greeting("Italy")
  greeting("Russia")
}
