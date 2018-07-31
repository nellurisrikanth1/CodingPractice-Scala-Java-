package com.scala.practice.implementation

import java.util.Scanner

/**
  * Let's define Old number as a number , such that it is divisible by count of odd integers in the range  to . If number does not hold this property, then such number is defined as Cold number.
  * You are given an array  and  tasks of the form  , you have to find what is the minimum numbers of steps needed to make subarray from  to  balanced.
  * Any subarray is said to be balanced if count of Old number(s) is not less than count of Cold number(s) in that subarray. In every step, you can either increase the value of some array element by 1 or you can decrease an array element by 1.
  *
  * Note: All tasks are independent of each other.
  *
  * Input Format:
  * First line contains an integer , denoting the number of testcases.
  *
  * In each test case:
  * Firstl line contains , the number of elements in array .
  * Next line contains  space separated integers denoting array elements.
  * Next line contains , the number of queries.
  * Each of the next  lines contains two space separated integers L and R.
  *
  * Output Fomat:
  * For each task, print total number of steps needed to change the subarray such that subarray from  to  is balanced.
  * Answer for each task should be printed in a new line.
  */
object OldColdNumbers {
  def main(args: Array[String]): Unit = {
    val s = new Scanner(System.in)
    val t = s.nextInt()
    (1 to t).foreach(tc => {
      val n = s.nextInt()
      var elements = new Array[Int](n + 1)
      elements(0) = 0
      var sum = 0
      for (i <- 1 to n) {
        val inp = s.nextInt()
        if (inp % 2 != 0 && inp != 1)
          elements(i) = sum
        else {
          sum += 1
          elements(i) = sum
        }
      }
      val qs = s.nextInt()
      for (q <- 1 to qs) {
        val left = s.nextInt()
        val right = s.nextInt()
        val old = elements(right) - elements(left - 1)
        val cold = right - left + 1 - old
        if (cold > old)
          println(Math.ceil((cold - old).toDouble / 2).toInt)
        else
          System.out.println("0")
      }
    })
  }
}


