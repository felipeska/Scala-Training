package codejump.scala.basic

/**
 * @author Scala-lang.org
 */
object Timer {

  def main(args: Array[String]) {
    oneTimePerSecond(() => println("Time flies like an arrow ..."))
  }

  def oneTimePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback();
      Thread sleep 100
    }
  }
}
