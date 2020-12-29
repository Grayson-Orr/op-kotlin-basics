// The entry point to a Kotlin program. In Kotlin 1.3, you can declare main without any params.
fun main() { // or
// fun main(args: Array<String>) { 

  /*==================================================
  Variables
  ==================================================*/

  // Kotlin does not enforce immutability (recommended). Use val over var.
  var a: String = "Hello, World!" // Mutable variable.
  println(a)
  val b: Int = 1 // Immutable variable.
  println(b)
  val c = 3  // Immutable variable. Initialised without specifying the type. The compiler infers the type Int.
  println(c)
  var d: Int
  println(d) // Compiler error - variable 'd' must be initialized

  /*==================================================
  Null safety
  ==================================================*/

  // Kotlin does not allow the assignment of null to variable types. If you need a variable that can be null, declare it nullable by adding ? at the end of its type.
  var notNullable: String = "Hello, World!"
  var nullable: String? = "Hello, World!"
  notNullable = null // Compiler error - null can not be a value of a non-null type.
  nullable = null
}
