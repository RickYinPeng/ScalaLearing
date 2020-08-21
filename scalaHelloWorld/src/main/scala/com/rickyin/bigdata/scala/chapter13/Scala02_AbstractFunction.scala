package com.rickyin.bigdata.scala.chapter13

import scala.util.control.Breaks

/**
 * TODO 控制抽象: 将代码作为参数传入高阶函数中
 *    如果函数作为参数传递给另外一个函数,如果这个函数不需要参数,也不需要返回值,那么可以直接传递代码逻辑
 */
object Scala02_AbstractFunction {
  def main(args: Array[String]): Unit = {

    /**
     * 函数如果参数很多需要换行的时候,可以将小括号变成大括号
     */
    Breaks.breakable{
      for (i <- 1 to 5){
        if(i == 3){
          Breaks.break()
        }
      }
    }
    //TODO 声明控制抽象
    def test(f: => Unit):Unit = {
      f
    }
    test{
      println("xxxx")
    }

  }
}
