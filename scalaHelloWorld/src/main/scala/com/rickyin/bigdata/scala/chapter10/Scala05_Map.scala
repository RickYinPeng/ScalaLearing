package com.rickyin.bigdata.scala.chapter10

import scala.collection.mutable

/**
 * TODO Map集合: K-V
 *  Java中Map使用: hashMap.put(k,v)
 *  Scala中k-v对数据采用特殊的方式声明 如: Map("a" -> 1, "b" -> 2, "c" -> 3)
 */
object Scala05_Map {
  def main(args: Array[String]): Unit = {
    println("---------------------Map集合声明")
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map.mkString(","))
    println("---------------------Map增加数据")
    val map1: Map[String, Int] = map + ("d" -> 4)
    println(map1.mkString(","))

    println("---------------------Map根据Key删除数据")
    val map2: Map[String, Int] = map - ("b")
    println(map2.mkString(","))

    println("---------------------Map修改数据")
    val map3: Map[String, Int] = map.updated("b", 5)
    println(map3.mkString(","))

    println("---------------------Map取某个key的数据")
    //Scala为了防止集合出现空指针问题,提供了一个特殊的类: Option,有两个特殊的对象:Some,None
    val option: Option[Int] = map.get("a")
    val option2: Option[Int] = map.get("q")
    println(option) //打印: Some(1)
    println(option2) //打印: None
    println(option.get) //打印: 1
    //println(option2.get) //报错: java.util.NoSuchElementException: None.get
    //如果获取的 option 为None,当我们再去调用 get 方法的时候还是会报错,为了不报错,Option 类提供了有默认值的方法
    println(option2.getOrElse(0)) // 有值就取值,没值就取0

    println("---------------------不可变Map集合")
    println(map == map1)

    println("---------------------可变Map集合")
    val mmap: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)



  }
}
