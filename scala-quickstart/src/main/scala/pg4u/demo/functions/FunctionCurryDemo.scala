package pg4u.demo.functions

object FunctionCurryDemo {
  //Original function.
  def multiply(a:Int, b:Int,c:Int) = a * b * c

  //Transformed function.
  def multiplyCurry (a: Int) = (b: Int) => (c : Int) => a * b * c

  //Alternative syntax for above transformation.
  def multiplyCurryAlternative (a: Int)(b: Int)(c : Int) = a * b * c

  def main(args: Array[String]): Unit = {
    val a = 100
    val b = 200
    val c = 300
    println("Original Multiplication result =" + multiply(a,b,c))
    println("Function Curry Multiplication result with all parameters passed =" +multiplyCurry(a)(b)(c))
    val mul1 = multiplyCurry(a) //function is broken into smaller functions, passing one arg at a time.
    val mal2 = mul1(b)
    println("Function Curry Multiplication result with parameters passed one after another ="+ mal2(c))
    // Alternative syntax function used to break into smaller function.
    // Note that for the alternative syntax if all arguments are not provided then wildcard has to be used.
    val mulAlt1 = multiplyCurryAlternative(a)_;
    val mulAlt2 = mulAlt1(b)
    println("Alternative Function Curry Multiplication result with parameters passed one after another ="+mulAlt2(c))
  }

}
