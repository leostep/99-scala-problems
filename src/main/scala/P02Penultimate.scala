import java.util.NoSuchElementException

import scala.annotation.tailrec

object P02Penultimate {
  def penultimateBuiltin[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException else ls.init.last

  @tailrec def penultimate[A](ls: List[A]): A = ls match {
    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    println(penultimate(List(1, 2, 5, 28, 4)))
  }
}
