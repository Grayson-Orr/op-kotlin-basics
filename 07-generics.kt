// Generic classes & functions increase code reusability by encapsulating common logic that is independent of a particular generic type

/*==================================================
Generic classes
==================================================*/

// Defines a generic class Stack<T> where T is called the generic type param 
class Stack<T>(vararg items: T) {
  // Inside the generic class, T can be used as a parameter like any other type
  private val els = items.toMutableList()
  fun push(el: T) = els.add(el)
  // You can also use T as a return type
  fun peek(): T = els.last()
  fun pop(): T = els.removeAt(els.size - 1)
  fun isEmpty() = els.isEmpty()
  fun size() = els.size
  override fun toString() = "Stack[${els.joinToString()}]"
}

/*==================================================
Generic functions
==================================================*/

// A utility function to create mutable stacks. The compiler can infer the generic type from the params, so you do not need to write stackOf<Int>(...)
fun <T> stackOf(vararg els: T) = Stack(*els)

fun main() {
  // val stack = Stack(2, 4, 6, 8)
  val stack = stackOf(2, 4, 6, 8)

  stack.push(10)
  
  println(stack)
  println("peek(): ${stack.peek()}")
  println(stack)
  
  for (i in 1..stack.size()) {
    println("pop(): ${stack.pop()}")
    println(stack)
  }
}