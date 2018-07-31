package com.scala.practice.codearena

object OriginalPrism extends App {

  val t = io.StdIn.readInt()
  for (tc <- 1 to t) {
    val inp = io.StdIn.readLine().split(" ").map(_.toDouble)
    val x = inp(0)
    val y = inp(1)
    val z = inp(2)
    val a = (x - y + z) / 2
    val b = (x + y - z) / 2
    val c = (z + y - x) / 2
    val area = 2 * (a * b) + 2 * (b * c) + 2 * (a * c)
    import java.text.DecimalFormat
    val df = new DecimalFormat("##.00")
    println(df.format(area))
  }

}
