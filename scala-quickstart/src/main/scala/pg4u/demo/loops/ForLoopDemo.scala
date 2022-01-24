package pg4u.demo.loops

object ForLoopDemo {
  def main(args: Array[String]): Unit = {
    for(i <- 0 to 5) {
      println("Current value of i is "+i)
    }

    for(i <- 0.until(5)){
      println("Current value of i is "+i)
    }

    for(i <- 0 to 2; j <- 0 to 3) {
      println("Nested execution values for i="+i+" j="+j)
    }

    for(i<- 1 to 100; if(i%3==0 && i%5==0)) {
      println(i + " is divisible by both 3 and 5.")
    }

    var list = List(1,3,6,8,2,4,3)  //A list can be declared in this way in Scala
    for(i <- list) {
      println("value from list is "+i)
    }
    val squareList = for{i<- 1 to 100; if(i%3==0 && i%5==0)} yield {
      i*i
    }
    print(squareList)
  }
}
