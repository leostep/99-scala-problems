package lists

object P07Flatten {

  def flatten(list: List[Any]): List[Any] = list match {
    case x :: xs => x match {
      case list1: List[Any] => flatten(list1) ++ flatten(xs)
      case _ => x +: flatten(xs)
    }
    case Nil => Nil
  }

}
