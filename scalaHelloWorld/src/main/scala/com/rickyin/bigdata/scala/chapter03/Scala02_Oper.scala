package com.rickyin.bigdata.scala.chapter03

object Scala02_Oper {
  def main(args: Array[String]): Unit = {
    /**
     * 关系运算符基本和Java一致
     */
    val b = 10
    if (b == 10) {
      println(true)
    }

    /**
     * 在Scala中所有的表达式都有结果
     * var a = 10
     * if(a=10){     //这一行会报错,但是报错并不是因为语法错误的问题，而是返回结果类型的问题，而在Java中是语法错误
     * println(true)
     * }
     */

    /**
     * 在Scala中不支持三目运算符
     */
  }
}
