package pg4u.demo.loops

object WhileLoopDemo {
  def main(args: Array[String]): Unit = {
    var i = 1
    while(i < 5) {
      println(i)
      i+=1
    }
  }
}
