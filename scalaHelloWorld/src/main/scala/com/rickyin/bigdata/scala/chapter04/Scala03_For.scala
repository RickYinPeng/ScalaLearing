package com.rickyin.bigdata.scala.chapter04

import scala.util.control.Breaks._

/**
 * for循环表达式
 */
object Scala03_For {
  def main(args: Array[String]): Unit = {
    /**
     * TODO Java中的 for 循环
     *
     * for(int i = 0;i<10;i++){
     * //循环体
     * }
     *
     * for(String s: strings){
     * //循环体
     * }
     */

    /**
     * TODO Scala中的for循环
     */
    //使用 1 to 5 表示循环的范围，从1到5(包含1和5)
    //使用 1 until 5 表示循环的范围，从1截止到5(不包含5)
    for (i <- 1 to 5) {
      println(s"i=${i}")
    }
    println("--------------")
    for (i <- 1 until 5) {
      println(s"i=${i}")
    }
    println("--------------")
    for (i <- 1 to 3) {
      for (j <- 1 until 3) {
        println(s"${i} = ${j}")
      }
    }
    println("--------------")

    /**
     * 九层妖塔：Scala的一道面试题
     *        *
     *       ***
     *      *****
     * 要求使用一层 for 循环实现
     */
    for (i <- Range(1, 18, 2)) {
      println(" " * ((18 - i) / 2) + "*" * i + " " * ((18 - i) / 2))
    }

    /**
     * Range(0,34,2):
     * 第一个参数: 起始位置
     * 第二个参数: 结束位置(不包括)
     * 第三个参数(可选): 步长(不选的话默认是1)
     */
    val sumNumbers = Range(0,34,2)
    var myList1 = Range(10, 20, 2)
    println(sumNumbers)
    println(myList1)
    println("--------------")

    /**
     * TODO 循环守卫
     * 所谓守卫就是增加了一个判断条件，如果条件成立，那么执行循环体，如果条件不成立，跳过循环体，类似 Java中的 continue
     * Scala中没有 continue 关键字
     */
    for (i <- 1 to 5 if i % 2 == 0) {
      println(s"${i}")
    }
    println("--------------")

    /**
     * TODO for 循环返回值
     * 默认情况下，for循环的返回值为 Unit:()
     */
    val unit = for (i <- 1 to 3) {
      "asb"
    }
    println(unit)
    println("--------------")

    /**
     * TODO for 循环返回值
     * 使用yield 关键字会将结果放入一个 Vector 集合中
     */
    val rel = for (i <- 1 to 10) yield i * 2
    println(rel) //结果: Vector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    println("--------------")

    /**
     * TODO 中断循环
     * Java中采用 break
     * Scala中没有 break 关键字，但是可以采用对象的方式进行中断
     */

    //类似 try{} catch
    breakable {
      for (i <- 1 to 10) {
        if (i == 5) {
          break()
        }
        println(s"${i}")
      }
    }
    println("循环结束")
    println("--------------")
  }
}
