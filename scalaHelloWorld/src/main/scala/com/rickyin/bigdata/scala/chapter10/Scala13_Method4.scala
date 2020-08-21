package com.rickyin.bigdata.scala.chapter10

import scala.collection.mutable

/**
 * TODO fold操作(折叠)的应用场景
 */
object Scala13_Method4 {
  def main(args: Array[String]): Unit = {
    //将两个Map进行合并,相同的key做累加,不同的key直接增加
    //a->4,b->2,c->5,d->1
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3) //当前集合每一条
    val map2: mutable.Map[String, Int] = mutable.Map("a" -> 3, "c" -> 2, "d" -> 1) //集合之外的

    val map3: mutable.Map[String, Int] = map1.foldLeft(map2)((map, t) => {
      println("map: "+map)
      println("t: "+t)
      // "a"->1
      // Map集合设置的方式,map(key)=value
      map(t._1) = map.getOrElse(t._1, 0) + t._2
      map
    })
    println(map3)
  }
}
