package pg4u.demo.functions

import java.util.Date

object PartialFunctionDemo {
  //Original function definition. The intention of the function is to print a message in the given format
  def print(date: Date, msg: String) = println(date+" "+msg)

  def main(args: Array[String]): Unit = {
    /**
     * A partial function is created
     * where we know that the first argument will be new Date
     * and second argument is wildcard of type String
     */
    val partialPrintFn = print(new Date(), _:String)
    for(i <- 1 to 10) {
      val message = "This is message no "+ i
      /**
       * First argument in partial function is already defined. So only wildcard is defined here
       */
      partialPrintFn(message)
      //Sleeping for 2 seconds in each execution so that the time difference is visible.
      Thread.sleep(2000)
    }
  }
}
