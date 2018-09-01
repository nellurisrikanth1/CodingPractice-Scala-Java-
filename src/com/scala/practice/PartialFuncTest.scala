package com.scala.practice

object PartialFuncTest extends App {

  val even: PartialFunction[Int, Unit] = {
    case x: Int if (x % 2 == 0) => println(s"even $x")
  }

  val odd: PartialFunction[Int, Unit] = {
    case x: Int if (x % 2 != 0) => println(s"odd $x")
  }

  val evenNumber = even

  val number = even orElse odd

  (1 to 11) foreach number

  (1 to 10) collect even

}
