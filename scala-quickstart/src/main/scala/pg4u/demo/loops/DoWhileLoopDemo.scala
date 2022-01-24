package pg4u.demo.loops

object DoWhileLoopDemo {
  def main(args: Array[String]): Unit = {
    var i=2
    do {
      println(i)
      i+=1
    } while(i>3 && i<6)
  }
}
