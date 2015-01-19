package codejump.scala.basic

/**
 * @author Scala-lang.org
 */
abstract class Tree

case class Sum(l: Tree, r: Tree) extends Tree

case class Var(n: String) extends Tree

case class Const(v: Int) extends Tree

