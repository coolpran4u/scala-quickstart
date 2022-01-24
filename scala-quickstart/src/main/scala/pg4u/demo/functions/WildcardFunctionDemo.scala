package pg4u.demo.functions

object WildcardFunctionDemo {

  def arithmetic (a: Int, b: Int,  fn: (Int, Int)=>Int):Int = fn(a,b)

  def main(args: Array[String]): Unit = {
    val add = arithmetic(10, 20, _+_) // _+_ is equivalent to (x,y) => x+y
    println("Addition="+ add)
    val max = arithmetic(10, 20, _ max _) // _ max _ is equivalent to (x,y) => x.max(y)
    println("Maximum="+ max)
    val min = arithmetic(4, 27, _ min _) // _ min _ is equivalent to (x,y) => x min y
    println("Minimum="+ min)
  }
}
