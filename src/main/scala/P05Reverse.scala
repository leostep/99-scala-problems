object P05Reverse {

  def reverseBuiltin[A](ls: List[A]): List[A] = ls.reverse

  def reverseRec[A](ls: List[A]): List[A] = ls match {
    case x :: xs => reverseRec(xs) :+ x
    case _ => ls
  }

  def reverseTailRec[A](list: List[A]): List[A] = {
    def revRec(ls: List[A], rs: List[A]): List[A] = rs match {
      case Nil => ls
      case x :: xs => revRec(x :: ls, xs)
    }

    revRec(List(), list)
  }

  def reverseFunctional[A](list: List[A]): List[A] = list.foldLeft(List[A]())((xs, e) => e :: xs)

}
