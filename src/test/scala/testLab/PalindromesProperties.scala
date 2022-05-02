package testLab

import org.scalacheck.Prop.{exists, forAll}
import org.scalacheck.{Arbitrary, Gen, Prop, Properties}

case class Palindrome(string: String) {
  if(string != string.reverse) throw new Exception("Not a palindrome")
}

class PalindromesProperties extends Properties("Palindromes"):
  given arbitraryPalindrome: Arbitrary[Palindrome] = Arbitrary(
    for
      s <- Gen.alphaStr
      c <- Gen.alphaChar
    yield
      Palindrome(s + c + s.reverse)
  )
  property("A palindrome and its reverse are the same") =
    forAll { (p: Palindrome) => p.string == p.string.reverse }
