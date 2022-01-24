package pg4u.demo.conditionals

object MatchExpressionDemo {
  def main(args: Array[String]): Unit = {
    /**
     * Match as statement
     */
    var classification = "man"
    var gender = ""
    classification match {
      case "boy" => gender = "male"
      case "girl" => {
        gender = "female"
      }
      case "man" =>
        gender = "male"
      case "woman" => gender = "female"
      case _ => gender = "unknown gender"
    }
    println("gender for " + classification)


    /**
     * Match as expression
     */
    classification = "girl"
    gender = classification match {
      case "boy" => "male"
      case "girl" => "female"
      case "man" => "male"
      case "woman" => "female"
      case _ => "unknown gender"
    }
    println("gender for " + classification)

    /**
     * Match as expression with OR operation for case using pipe (|)
     */
    classification = "woman"
    gender = classification match {
      case "boy" | "man" => "male"
      case "girl" | "woman" => "female"
      case _ => "unknown gender"
    }
    println("gender for " + classification + " is " + gender)

    /**
     * Match default condition
     */
    classification = "human"
    gender = classification match {
      case "boy" | "man" => "male"
      case "girl" | "woman" => "female"
      case _ => "unknown gender"
    }
    println("gender for " + classification + " is " + gender)
  }
}
