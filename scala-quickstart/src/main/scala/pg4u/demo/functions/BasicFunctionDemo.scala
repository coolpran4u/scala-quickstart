package pg4u.demo.functions

object BasicFunctionDemo {
  def main(args: Array[String]): Unit = {
    val a = 30
    val b = 10
    println("Addition of "+a+" and "+b+" is "+add(a, b))
    println("Subtraction of "+a+" and "+b+" is "+subtract(a, b))
    println("Division of "+a+" and "+b+" is "+divide(a, b))
    println("Multiplication of "+a+" and "+b+" is "+multiply(a, b))
    println("Square of "+a+" is "+Power.square(a))
    println("Cube of "+b+" is "+(Power cube b))
  }
  /**
   * This function is defined following the complete function syntax.
   */
  def add(a: Int, b: Int): Int = {
    val c = a + b
    return c
  }
  /**
   * return is optional in case of function. Type of last line is considered return type.
   */
  def subtract(a: Int, b: Int): Int = {
    val c = a - b
    c
  }
  /**
   * For a single line function, the curly brackets are not required along with return.
   */
  def divide(a: Int, b: Int): Int = a / b

  /**
   * If return type is not defined, it is inferred from the method
   */
  def multiply(a: Int, b: Int) = a * b
}

/**
 * Defining function inside another object.
 */
object Power {
  def square(a: Int): Int = a * a

  def cube(a: Int) = a * a * a
}
