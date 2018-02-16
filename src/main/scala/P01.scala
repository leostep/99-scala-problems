object P01 {
  def lastBuiltin[A](ls: List[A]): A = ls.last

  def lastManual[A](ls: List[A]): A = ls match {
    case x :: Nil => x
    case _ :: xs => lastManual(xs)
    case _ => throw new NoSuchElementException
  }
}