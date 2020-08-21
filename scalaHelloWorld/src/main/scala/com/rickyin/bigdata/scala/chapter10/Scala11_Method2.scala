package com.rickyin.bigdata.scala.chapter10

/**
 * TODO reduce操作(化简)
 */
object Scala11_Method2 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)

    /**
     * reduce看源码发现就是调用了reduceLeft,所以reduce和reduceLeft功能一样
     */
    //数据减少,不是结果变少
    //将集合的数据经过逻辑处理后只保留一个结果,具体的结果需要参考逻辑实现
    val i: Int = list.reduce((left, right) => left + right)
    println(i)
    //从源码角度讲, reduce和reduceLeft功能一样
    val i2: Int = list.reduceLeft(_ + _)
    println(i2)
    val i1: Int = list.reduce(_ + _) //简写
    println(i1)

    /**
     * 除了reduceLeft还有一个reduceRight
     * reversed ==> 4,3,2,1
     * reduceLeft ==> ((4-3)-2)-1 ==>  1-(2-(3-4))
     */
    val i3: Int = list.reduceRight(_ + _)
    val i4: Int = list.reduceRight(_ - _)
    println(i3)
    println(i4)
  }
}
