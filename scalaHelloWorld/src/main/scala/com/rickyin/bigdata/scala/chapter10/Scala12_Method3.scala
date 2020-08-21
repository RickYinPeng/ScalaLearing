package com.rickyin.bigdata.scala.chapter10

/**
 * TODO fold操作(折叠): 也可以对我们的集合数据进行简化,最终获取一条结果
 */
object Scala12_Method3 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)

    /**
     * fold源码: def fold[A1 >: A](z: A1)(op: (A1, A1) => A1): A1 = foldLeft(z)(op)
     * 所以从源码角度讲 fold就等同于foldLeft
     */
    //fold方法可以传递2个部分的参数,第一个部分表示集合之外的数据,第二个部分的参数表示数据进行的逻辑处理
    val i: Int = list.fold(100)(_ - _)
    val i1: Int = list.foldLeft(100)(_ + _)
    println(i)  //打印: 90
    println(i1) //打印: 110

    /**
     * foldRight
     */
    val i2: Int = list.foldRight(10)(_ - _)
    println(i2) //打印: 8

    /**
     * scanLeft: 保留foldLeft计算的中间结果
     *  list.scanLeft(10)(_ - _)的计算过程: (((10-1)-2)-3)-4
     *  中间结果 9 7 4 0
     */
    val list1: List[Int] = list.scanLeft(10)(_ - _)
    println(list1)

    /**
     * list.scanRight(10)(_ - _)的计算过程: 1-(2-(3-(4-10)))
     */
    val list2: List[Int] = list.scanRight(10)(_ - _)
    println(list2)
  }
}
