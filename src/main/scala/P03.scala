import scala.annotation.tailrec

object P03 {
  def nthBuiltin[A](n: Int, ls: List[A]): A = ls(n)

  def nth[A](n: Int, ls: List[A]): A = {
    @tailrec def nthRec(idx: Int, xs: List[A]): A = xs match {
      case x :: _ if idx == 0 => x
      case _ :: tail if idx != 0 => nthRec(idx - 1, tail)
      case Nil => throw new NoSuchElementException
    }

    nthRec(n, ls)
  }

}
