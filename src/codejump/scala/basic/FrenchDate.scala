package codejump.scala.basic

import java.text.DateFormat._
import java.util.{Date, Locale}

/**
 * @author Scala-lang.org
 */
object FrenchDate {

  def main(args: Array[String]) {
    val now = new Date
    val dateFormat = getDateInstance(LONG, Locale.FRANCE)
    println(dateFormat.format(now))
  }
}
