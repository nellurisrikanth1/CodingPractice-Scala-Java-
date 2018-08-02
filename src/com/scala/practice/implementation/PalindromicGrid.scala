package com.scala.practice.implementation

import java.util.Scanner

/**
  * You are given a 2-d grid of N rows and M columns containing lower case alphabets only. You need to check whether it is possible to rearrange the complete grid so that each row and column becomes palindromic.
  *
  * Input :
  *
  * The first line of input contains T, the number of test cases.
  * The first line of each test case contains two space-separated integers N and M, denoting the number of rows and columns.
  * Each of the following N lines contains a string of length M.
  * Output :
  *
  * Output YES if it is possible to rearrange the grid to make all the rows and columns palindromic. else output NO.
  */
object PalindromicGrid {
  def main(args: Array[String]): Unit = {
    val tcs = io.StdIn.readInt()
    for (tc <- 1 to tcs) {
      val Array(n, m) = io.StdIn.readLine.split(" ").map(_.toInt)

      /*val frequency = new Array[Int](26)
      (1 to n).foreach(_ => {
        io.StdIn.readLine.toCharArray.foreach(c => frequency(c - 'a') += 1)
      })*/

      val frequency = (1 to n).map(_ => io.StdIn.readLine()).mkString("").groupBy(identity).values.map(_.length)

      println(if (n % 2 == 0 && m % 2 == 0) {
        if (frequency.exists(_ % 4 > 0)) "NO" else "YES"
      } else {
        if (frequency.count(_ % 2 == 1) > 1) "NO" else "YES"
      })
    }
  }
}
