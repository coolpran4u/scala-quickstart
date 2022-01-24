package pg4u.demo.functions

object AnonymousFunctionDemo {
  def main(args: Array[String]): Unit = {
    //Anonymous function without parameter.
    val print = () => "Hi. This is an anonymous function demo.";

    //Anonymous function with two parameters.
    val add = (a: Int, b: Int) => a + b
    println(print())
    println(add(5, 10))
  }
}
