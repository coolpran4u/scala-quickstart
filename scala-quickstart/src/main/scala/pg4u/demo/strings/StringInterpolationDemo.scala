package pg4u.demo.strings

object StringInterpolationDemo {
  def main(args: Array[String]): Unit = {
    val str1: String = "Hello!"
    val str2 = "This is Scala Quick Start"
    val part = 1
    val version = 1.0
    println(s"$str1!! $str2 Part $part. \nCurrent version is $version")
    println("----------------")
    println(f"$str1%s!! $str2%s Part $part%d. \nCurrent version is $version%f")
    println("----------------")
    println(raw"$str1%s!! $str2%s Part $part%d. \nCurrent version is $version%f")
  }
}
