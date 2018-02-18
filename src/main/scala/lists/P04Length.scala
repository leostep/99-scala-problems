package lists

import scala.annotation.tailrec

object P04Length {

  def lengthBuiltin[A](ls: List[A]): Long = ls.length

  def length[A](ls: List[A]): Long = {
    @tailrec def size(n: Long, xs: List[A]): Long = xs match {
      case Nil => n
      case _ :: tail => size(n + 1, tail)
    }

    size(0, ls)
  }

  def lengthFunctional[A](ls: List[A]): Long =ls.foldLeft(0)((x, _) => x + 1)

}
