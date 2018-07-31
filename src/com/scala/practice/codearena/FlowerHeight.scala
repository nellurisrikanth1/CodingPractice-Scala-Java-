package com.scala.practice.codearena

object FlowerHeight {
  def main(args: Array[String]): Unit = {
    val n = io.StdIn.readInt();
    var inp = io.StdIn.readLine().split(" ").map(_.toInt)
    for (i <- 1 to inp.length - 1) {
      for (j <- 0 until i) {
        if (inp(j) >= inp(i))
          inp(j) += 1;
      }
    }
    println(inp.mkString(" "))
  }
}
