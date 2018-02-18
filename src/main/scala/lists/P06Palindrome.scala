package lists

object P06Palindrome {

  def isPalindrome[A](list: List[A]): Boolean = list == list.reverse

}
