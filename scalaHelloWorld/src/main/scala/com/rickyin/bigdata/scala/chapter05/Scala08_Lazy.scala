package com.rickyin.bigdata.scala.chapter05

object Scala08_Lazy {

  def main(args: Array[String]): Unit = {
    /**
     * TODO 惰性: lazy
     * 1.lazy不能修饰 var 类型的变量(val的值无法修改,var的值可以修改)
     * 2.
     */
    lazy val res = sum(10, 20)
    println("----------------")
    println(s"res=${res}")
  }

  def sum(i: Int, j: Int): Int = {
    println("sum()执行了......")
    return i + j
  }
}
