package pg4u.demo.functions

object AdvanceFunctionDemo {
  def add(a: Int = 10, b: Int=20) = a + b //Default value of a is 10 and b is 20
  def add(a : Int) = a + 10   //overloaded function that adds 10 to input number

  def main(args: Array[String]): Unit = {
    val a = 40
    val b = 50
    println("Addition without parameters:" + add())
    println("Addition by providing first parameter:" + add(a))
    println("Addition by providing both parameters:" + add(a,b))

  }
}
