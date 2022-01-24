package pg4u.demo.functions

object OperatorAsFunctionDemo {

  object Arithmetic {
    def +(a: Int, b: Int) = a + b // Syntactic Sugar for a.+(b)

    def *(a: Int, b: Int) = a.*(b) // To demonstrate that * is actually a function and not an operator

    def **(a: Int) = a * a
  }

  def main(args: Array[String]): Unit = {
    println("Addition = "+ Arithmetic.+(4,6))
    println("Multiplication = "+ Arithmetic.*(4,6))
    println("Square = "+ Arithmetic ** 4)
  }
}
