package lists

import lists.P07Flatten.flatten

object Main {


  def main(args: Array[String]): Unit = {
    println(flatten(List(List(1, 3), 2, List(3, List(5, 8)))))
    println(flatten(List(List(1, 1))))
    println(flatten(List(1)))
  }
}
