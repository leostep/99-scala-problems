package lists

object P01Last {
  def lastBuiltin[A](ls: List[A]): A = ls.last

  def lastManual[A](ls: List[A]): A = ls match {
    case x :: Nil => x
    case _ :: xs => lastManual(xs)
    case _ => throw new NoSuchElementException
  }

}