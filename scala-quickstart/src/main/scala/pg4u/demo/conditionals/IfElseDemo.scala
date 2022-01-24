package pg4u.demo.conditionals

object IfElseDemo {
  def main(args: Array[String]): Unit = {
    /*
     * If else as Statement
     */
    val x = 11
    var result = ""
    if(x > 10) {
      result = "greater than 10."
    } else if(x == 10) {
      result = "equal to 10."
    } else {
      result = "less than to 10."
    }
    println("The given number in 'x' is "+result)

    /*
     * If else as expression. This is similar to ternary operator in Java.
     * Equivalent Java expression would be:
     * String result = (y > 10) ? "greater than 10." : (y == 10) ? "equal to 10." : "less than to 10."
     */
    val y = 9
    result = if(y > 10) "greater than 10." else if(y == 10) "equal to 10." else "less than to 10."
    println("The given number in 'y' is "+result)
  }
}
