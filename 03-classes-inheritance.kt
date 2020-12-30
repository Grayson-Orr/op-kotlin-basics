/*==================================================
Classes
==================================================*/

// Class with no props or user-defined constructor. In Kotlin, a no-param default constructor is automatically created.
class Person                                

// Class with two props. id is immutable & firstName/lastName is mutable. If the class has no body, curly braces can be omitted.
class Employee(val id: Int, var firstName: String, var lastName: String) 

/*==================================================
Inheritance
==================================================*/

// In Kotlin, classes & methods are final by default (not allowed to be overridden). If you want to allow class inheritance, mark the class with the open modifier.
open class Dog {
  open fun sound() {
    println("bow wow wow!")
  }
}

// The empty parentheses indicate an invocation of the superclass's default constructor.
class Bulldog : Dog() {
  // Overriding methods or attributes requires the override modifier.
  override fun sound() { 
    println("woof woof woof!")
  }
}

/*==================================================
Inheritance with parameterized constructor
==================================================*/

open class Tiger(val region: String, val sound: String) {
  fun sound() {
    println("A tiger from $region says $sound!")
  }
}

// If you want to use a parameterized constructor of the superclass, provide the constructor args in the subclass declaration.
class SiberianTiger : Tiger("Sikhote-Alin", "roooaaar")  

/*==================================================
Passing constructor args to superclass
==================================================*/

// region in the BengalTiger declaration is neither a var nor val (it is a constructor arg), who value is passed to the name props of the superclass.
class BengalTiger(region: String) : Tiger(region = region, sound = "roooaaar")

fun main() {
  // Create a new instance of Person via the default constructor. In Kotlin, the new keyword is not used.
  val person = Person()
  println(person)
  val employee = Employee(1, "John", "Doe")
  employee.firstName = "Jane" // Updating the Employee object's firstName to Jane.
  println("${employee.firstName} ${employee.lastName}") // Accessing the Employee object's firstName & lastName props.
  val dog: Dog = Bulldog()
  dog.sound()
  val siberianTiger: Tiger = SiberianTiger()
  siberianTiger.sound()
  val bengalTiger: Tiger = BengalTiger("Sundarbans")
  bengalTiger.sound()
}