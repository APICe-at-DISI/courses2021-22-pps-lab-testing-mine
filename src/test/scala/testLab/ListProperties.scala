package testLab

import org.scalacheck.Prop.{exists, forAll}
import org.scalacheck.{Arbitrary, Gen, Prop, Properties}

class ListProperties extends Properties("Lists"):
  property("Associativity") =
    forAll { (l1: List[Int], l2: List[Int], l3: List[Int]) => (l1++l2)++l3 == l1++(l2++l3) }
