package com.rickyin.bigdata.scala.chapter10

import scala.collection.mutable

/**
 * TODO Set集合:无序,不可重复
 *    1.默认Scala提供的set集合就是不可变的(immutable)
 */
object Scala04_Set {
  def main(args: Array[String]): Unit = {
    println("---------------------Set集合声明")
    //默认Scala提供的set集合就是不可变的(immutable)
    val set: Set[Int] = Set(1, 2, 3, 4)
    println(set.mkString(","))

    println("---------------------增加数据")
    //增加数据
    val set2: Set[Int] = set + 11
    println(set2.mkString(","))

    println("---------------------删除数据")
    //删除数据
    val set3: Set[Int] = set - 3
    println(set3.mkString(","))

    println("---------------------for循环遍历")
    for (elem <- set) {
      println(elem)
    }

    println("---------------------可变Set集合")
    /**
     * TODO 可变Set集合(mutable)
     */
    val mset: mutable.Set[Int] = mutable.Set(1, 2, 3, 4)


  }
}
