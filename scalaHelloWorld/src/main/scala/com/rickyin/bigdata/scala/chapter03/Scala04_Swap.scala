package com.rickyin.bigdata.scala.chapter03

import scala.io.StdIn

object Scala04_Swap {
  def main(args: Array[String]): Unit = {
    /**
     * 两数交换：异或
     */
    var a = 10
    var b = 20
    a = a^b
    b = a^b
    a = a^b
    println(a)
    println(b)
  }
}
