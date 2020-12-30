// Entry point to a Kotlin program. In Kotlin 1.3, you can declare main without any params
fun main() { // or
// fun main(args: Array<String>) { 

  /*==================================================
  Variables
  ==================================================*/

  // Kotlin does not enforce immutability, though it is recommended. It is also recommended to use val over var wherever possible
  var a: String = "Hello, World!" // Example of a mutable variable. The use of var
  println(a)
  
  val b: Int = 1 // Example of a immutable variable. The use of val
  println(b)
  
  val c = 3  // Initialised without specifying a type. The compiler will infer the type as an Int
  println(c)
  
  var d: Int
  println(d) // If you run this code, the compiler will output the following error message: variable 'd' must be initialized

  /*==================================================
  Null safety
  ==================================================*/

  // Kotlin does not allow the assignment of null to variable types. If you need a 
  // variable that can be null, declare it nullable by adding a question mark (?) at the end of its type
  var notNullable: String = "Hello, World!"
  var nullable: String? = "Hello, World!"
  
  notNullable = null // If you run this code, the compiler will output the following error message: null can not be a value of a non-null type
  nullable = null
}
