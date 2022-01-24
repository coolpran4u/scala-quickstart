package pg4u.demo.datatypes

object DatatypeDemo {

  def main(args: Array[String]): Unit = {
    var x : Int = 10
    x = x + 5
    println(x)
    val y : Int = 20
    /*
    * Uncomment the line below to verify that you cannot reassign the value of a val variable.
    */
    //y = y + 10
    var a = 10
    println("Type of a is " + a.getClass)
    var b = 'b'
    println("Type of b is " + b.getClass)
    var c = "Test"
    println("Type of c is " + c.getClass)
    val d = false
    println("Type of d is " + d.getClass)
    val e = 10.0
    println("Type of e is " + e.getClass)
    var f = 11.0f
    println("Type of f is " + f.getClass)
  }
}
