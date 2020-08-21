package com.rickyin.bigdata.scala.chapter03

import scala.io.StdIn

object Scala03_In {
  def main(args: Array[String]): Unit = {
    /**
     * Scala中从键盘读取
     */
    val line: String = StdIn.readLine()
    println("line=" + line)
  }
}
