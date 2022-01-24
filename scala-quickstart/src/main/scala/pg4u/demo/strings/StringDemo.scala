package pg4u.demo.strings

object StringDemo {
  def main(args: Array[String]): Unit = {
    val str1: String = "Hello!"
    val str2 = "This is Scala Quick Start"
    println(str1 concat str2) //syntactic sugar for concat. Equivalent to str1.concat(str2)
    println("Length of str2="+ str2.length)
    println("%s!! %s Part %d. Enjoy!!".format(str1, str2, 1)) //format the output
    println("Equality check="+ "hello!".equalsIgnoreCase(str1))
  }
}
