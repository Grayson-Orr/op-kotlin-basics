/*==================================================
Default param values & named arguments
==================================================*/

// Function has a param of type String & returns Unit. You can think of Unit as void in other modern programming languages such as C++, C#, Java, etc
fun printMessage(message: String): Unit {
  println(message)
}

// Function has a second optional param with the default value of INFO:. Return type is omitted
fun printMessageWithPrefix(message: String, prefix: String = "INFO:") {
  println("$prefix $message") 
}

// Function has two params of type Int & returns an Int
fun sum(x: Int, y: Int): Int {
  return x + y
}

// Single-expression function has two params of type Int & returns an Int. The type is inferred by the compiler
fun multiply(x: Int, y: Int) = x * y

/*==================================================
Vararg params
==================================================*/

// Vararg allows you to pass any number of arguments by separating them with commas
fun printCountries(vararg countries: String) {
  for (country in countries) println(country)
}

fun printCountriesWithPrefix(vararg countries: String, prefix: String) {
  for (country in countries) println("$prefix $country")
}

fun main() {
  printMessage("Hello, World!")      
  
  printMessageWithPrefix("Test warning", "WARNING:")
  printMessageWithPrefix("Test info") // Calling the second function & omitting the second arg
  printMessageWithPrefix(prefix = "DEBUG:", message = "Test debug") // Calling the same function using named args & changing the order of args
  
  println(sum(1, 2))                                                  
  println(multiply(2, 4))  
  
  printCountries("Argentina", "Brazil", "China", "Democratic Republic of the Congo", "Ethiopia")      
  printCountriesWithPrefix("France", "Germany", "Haiti", prefix = "Country Name:") // You can set a value to prefix separately from the vararg using named args    
}
