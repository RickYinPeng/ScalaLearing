package com.rickyin.bigdata.scala.chapter10

import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

/**
 * TODO
 *  - 将集合 List(1, List(2, 3), List(4, 5)) 转换为 List(1,2,3,4,5) 这种结构
 */
object Scala15_Method5 {
  def main(args: Array[String]): Unit = {
    //将当前集合变成 List(1,2,3,4),该如何做
    val list: List[Any] = List(1, List(2, 3), List(4, 5))

    val list1: List[Any] = list.flatMap(any => {
      if (any.isInstanceOf[List[Int]]) {
        any.asInstanceOf[List[Int]]
      } else {
        List(any)
      }
    })
    println(list1) //打印: List(1, 2, 3, 4, 5)
    println("--------------------------并行")

    val result1: immutable.IndexedSeq[String] = (0 to 100).map { case _ => Thread.currentThread().getName }
    val result2: ParSeq[String] = (0 to 100).par.map { case _ => Thread.currentThread().getName }
    println(result1)
    println(result2)

  }
}
