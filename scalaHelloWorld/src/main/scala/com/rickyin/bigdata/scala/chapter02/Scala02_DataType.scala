package com.rickyin.bigdata.scala.chapter02

object Scala02_DataType {
  /**
   * 数据类型
   */
  def main(args: Array[String]): Unit = {
    /**
     * Scala是完全面向对象的语言，所以没有基本类型
     */
    val age: Int = 20;

    //byte、short、int、long、double、float、boolean、char
    val b: Byte = 10
    val s: Short = 10
    val i: Int = 10
    val l: Long = 10
    val f: Float = 10
    val d: Double = 10
    val bo: Boolean = true
    val c: Char = 'c'

    /**
     * Scala中可以无缝使用Java中的代码
     */
    val in: Integer = 10;
  }
}
