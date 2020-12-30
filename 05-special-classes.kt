/*==================================================
Data class
==================================================*/

// Data class with the data modifier
data class Employee(val id: Int, var firstName: String, var lastName: String) 

/*==================================================
Enum class
==================================================*/

// Enum class with three instances
enum class State {
  GREEN, RED, AMBER // The number of instances is finite & distinct
}

// Enum class with a property & a method
enum class Color(val rgb: Int) { // Each instance must pass an arg for the constructor param
  RED(0xFF0000),
  GREEN(0x00FF00),
  BLUE(0x0000FF);

  // Class members are separated from the instance definitions by a semicolon
  fun containsGreen() = (this.rgb and 0x00FF00 != 0)
}

/*==================================================
Object keyword
==================================================*/

// Used to obtain a data type with a single implementation. In Kotlin, you only need to declare an 
// object. It has no class, no constructor, only a lazy instance. Why lazy? It will be created when the 
// object is accessed, otherwise, it will not be created

// Object expression. You can create a single object, declare its members & access it within 
// one function. Objects like this are often created in Java as anonymous class instances
fun rentPrice(standardDays: Int, holidayDays: Int): Unit {
  val rates = object {
    var standard: Int = 30 * standardDays
    var holiday: Int = 50 * holidayDays
  }
  val total = rates.standard + rates.holiday
  println("Total price: $$total")
}

// Object declaration. It is not an expression & can not be used in a variable assignment. Use it to directly access its members
object Price {
  fun rentPrice(standardDays: Int, holidayDays: Int): Unit {
    var standard: Int = 30 * standardDays
    var holiday: Int = 50 * holidayDays
    val total = standard + holiday
    println("Total price: $$total")
  }
}

// It is similar to static methods in Java. Call object members using its class name as a qualifier
class Phone {
  companion object Ringer { // Its name can be omitted
    fun getRings(nTimes: Int) {
      for (i in 1..nTimes) println("ring!")
    }
  }
}

fun main() {
  val employeeOne = Employee(1, "John", "Doe")
  val employeeTwo = Employee(2, "Jane", "Doe")
  val employeeThree = Employee(2, "Jane", "Doe")

  println(employeeOne) // The toString method is auto-generated
  println(employeeOne.hashCode())
  println(employeeTwo.hashCode())
  println("employeeOne == employeeTwo: ${employeeOne == employeeTwo}")
  println("employeeTwo == employeeThree: ${employeeTwo == employeeThree}")
  println(employeeThree.copy()) // New instance of employeeThree using the copy function
  println(employeeThree.copy(3)) // copy accepts args in the same order as the class constructor
  println(employeeThree.copy(firstName = "Joe")) // Use copy with named arguments to change the a specific prop value

  val state = State.GREEN
  val trafficLights = when (state) { // Compiler can infer if a when-expression is exhaustive
    State.GREEN -> "Go"
    State.RED -> "Stop"
    State.AMBER -> "Slow down"
  }
  println(trafficLights)

  val green = Color.GREEN
  println(green) // Default toString returns the name of the instance
  println(green.containsGreen())
  println(Color.BLUE.containsGreen())

  rentPrice(10, 5)
  Price.rentPrice(10, 5)
  Phone.getRings(4)
}
