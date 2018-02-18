package lists

object P07Flatten {

  def flatten(list: List[Any]): List[Any] = list match {
    case x :: xs => x match {
      case list1: List[Any] => flatten(list1) ++ flatten(xs)
      case _ => x +: flatten(xs)
    }
    case Nil => Nil
  }

  def main(args: Array[String]): Unit = {
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
    println(flatten(List(List(1, 1))))
    println(flatten(List(1)))
  }

}
