package com.rickyin.bigdata.scala.chapter05

/**
 * TODO 异常
 */
object Scala09_Exception {
  def main(args: Array[String]): Unit = {
    try {
      var i = 10
      var j = 0
      var k = i / j
    } catch {
      case ex: Exception => println("捕获了异常")
      case ex: ArithmeticException => println("捕获了除数不能为零的算数异常")
    } finally {
      println("finally......")
    }
  }
}
