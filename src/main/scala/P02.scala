import java.util.NoSuchElementException

object P02 {
  def lastButOneBuiltin[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException else ls.init.last

  def lastButOneRecursive[A](ls: List[A]): A = ls match {
    case x :: _ :: Nil => x
    case _ :: xs => lastButOneRecursive(xs)
    case _ => throw new NoSuchElementException
  }
}
