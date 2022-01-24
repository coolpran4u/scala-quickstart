package pg4u.demo.functions

object ImpureClosureDemo {
  var x = 100
  def multiply(a: Int) = {
    var b = a * x // closure function as x is defined outside the function.
    x= x/2;
    b
  }

  def main(args: Array[String]): Unit = {
    x = x + 10
    println("First time multiplication of 5="+multiply(5))
    println("Second time multiplication of 5="+multiply(5))
  }
}
