package com.rickyin.bigdata.scala.chapter05

object Scala02_Function1 {
  def main(args: Array[String]): Unit = {
    // 函数: 入参(方法参数)、出参(返回值)
    def test(): Unit = {
      println("Test")
    }

    test()

    //有参,但无返回值
    //函数没有重载的概念
    //如果在同一个作用域中,函数不能同名
    def test1(s: String): Unit = {
      println(s)
    }

    test1("rickyin")

    //有参有返回值
    def test2(s: String): String = {
      return s + "..."
    }

    val str = test2("rickyin")
    println(str)

    /**
     * 在Scala中没有 throws 关键字,所以函数中有异常发生,也不需要在函数声明时抛出异常
     */

  }
}
