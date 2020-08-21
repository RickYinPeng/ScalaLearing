package com.rickyin.bigdata.scala.chapter09

/**
 * TODO 隐式转换
 *    1.Scala默认情况下支持数值类型的自动转换: byte -> short -> int -> long
 *    2.Scala默认情况下支持多态语法中的类型自动转换 child -> parent -> trait(interface)
 *    3.Scala也允许开发人员自定义类型转换规则:将两个无关的类型通过编程手段让它们可以自动转换
 *    4.在相同的作用域内,不能含有多个相同类型的转换规则
 */
object Scala01_Transform {
  def main(args: Array[String]): Unit = {

    implicit def transform(d: Double): Int = {
      d.toInt
    }
    // OCP = Open Close
    val i: Int = 5.0
    println(i)
  }
}
