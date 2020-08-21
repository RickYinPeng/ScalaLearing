package com.rickyin.bigdata.scala.chapter04

/**
 * 表达式
 */
object Scala02_Exp {
  def main(args: Array[String]): Unit = {
    /**
     * Scala中所有表达式都有返回值，具体的返回结果的值取决与满足条件的代码体的最后一行内容
     */
    var flag = true
    //if-else 表达式都有返回值，只不过这里它判断返回值是 Unit
    val result: Unit = if (flag) {

    }
    println(result) //控制台打印的是: () ,"()"就是Unit的值

    /**
     * Java中就不能这样写
     */
    val value: Any = if (flag) {
      "abc"
    }
    println(value)

    /**
     * Scala中使用 if-else 来模拟三元运算符,因为 if-else 是有返回值的
     */
    val str = if (flag) "a" else "b"
    println(str)
  }
}
