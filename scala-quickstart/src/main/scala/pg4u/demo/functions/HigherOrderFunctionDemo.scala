package pg4u.demo.functions

object HigherOrderFunctionDemo {
  /**
   * Higher Order Function for performing operation with two input integers.
   */
  def arithmeticOperation(a: Int, b: Int, fn: (Int, Int)=>Int): Int = fn(a,b)

  def main(args: Array[String]): Unit = {
    val add = arithmeticOperation(10, 20, (x,y)=>x + y) //anonymous function for addition
    println("Addition ="+add)
    val divide = arithmeticOperation(20, 10, (x,y)=>x / y) //anonymous function for division
    println("Division="+ divide)
  }
}
