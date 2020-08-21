package com.rickyin.bigdata.scala.chapter05

/**
 * TODO 函数式编程: 一种编程的范式(规范)，函数式编程关心的是问题的解决方案(封装功能): 重点在于函数(功能) 函数的入参,出参
 * 函数式编程重要的就是函数
 * 声明函数、调用函数
 * TODO Java中的方法和Scala中的函数都可以进行功能的封装,但是方法必须和类型绑定,但是函数不需要
 *
 * 面向对象: 解决问题时，将问题拆解成一个一个的小问题(形成对象)，分别解决
 * Java: 继承、实现、重写、多态
 */
object Scala01_Function {
  def main(args: Array[String]): Unit = {
    //Java中方法声明
    //public static void test(String s){}

    //函数声明
    //TODO Scala的语法非常灵活,在任意的语法中可以声明其他语法
    def test(s: String): Unit = {
      println(s)
    }

    test("asad")
  }

}
