package com.rickyin.bigdata.scala.chapter10

object Scala08_Method1 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    println("---------------------list.filter():过滤")
    //TODO 对集合的数据进行筛选过滤, true:保留, falase:不保留
    val filterList: List[Int] = list.filter(x => x % 2 == 0)
    println(filterList.mkString(","))

    println("---------------------list.zip():拉链")
    //TODO 拉链: ZIP(两两结合的意思)
    //1和3放在一块,2和4放在一块,3和5放在一块,7和6放在一块
    val list1 = List(1,2,3,7)
    val list2 = List(3,4,5,6)
    //将两个集合数据进行关联,关联后的数据形成了元组
    val tuples: List[(Int, Int)] = list1.zip(list2)
    println(tuples.mkString(","))

    println("---------------------list.union():集合并集")
    //TODO 集合并集
    val unionList: List[Int] = list.union(list2)
    println(unionList)

    //TODO 集合交集
    println("---------------------list.intersect():集合交集")
    val intersectList: List[Int] = list1.intersect(list2)
    println(intersectList)

    //TODO 集合差集
    println("---------------------list.diff():集合差集")
    val diffList: List[Int] = list1.diff(list2)
    println(diffList)
  }
}
