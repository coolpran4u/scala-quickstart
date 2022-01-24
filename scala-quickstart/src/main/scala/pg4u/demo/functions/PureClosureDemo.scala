package pg4u.demo.functions

object PureClosureDemo {

  val x = 100
  def multiply(a: Int) = a * x; // closure function as x is defined outside the function.

  def main(args: Array[String]): Unit = {
    println(multiply(5))
  }
}
