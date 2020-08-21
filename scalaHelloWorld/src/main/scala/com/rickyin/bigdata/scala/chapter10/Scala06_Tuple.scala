package com.rickyin.bigdata.scala.chapter10

/**
 * TODO 元组: Tuple
 *    1.将无关的数据当成一个整体来使用
 */
object Scala06_Tuple {
  def main(args: Array[String]): Unit = {
    println("---------------------Tuple声明")
    //将无关的数据当成一个整体来使用
    //empid,email,ordernum
    //使用小括号将数据关联在一起,形成一个组合
    //Tuple中最多的元素数据的个数为22个,超过就会报错
    val tuple: (String, Int, String) = ("rick", 1111, "xxxx")
    println(tuple)

    println("---------------------Tuple数据访问")
    //访问Tuple中的数据,调用相应的顺序编号: _顺序编号
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    println("---------------------Tuple循环遍历")
    for (elem <- tuple.productIterator) {
      println(elem)
    }

    println("---------------------Tuple")
    //如果元组中元素的个数为2,那么称之为对偶,类似于Map中的键值对
    val tuple1: (Int, String) = (1, "zhangsan")
    val tupleMap: Map[Int, String] = Map((1, "zhangsan"))
    tupleMap.foreach(t=>{println(t._1+"="+t._2)})
    println(tupleMap.get(1).get)

  }
}

class User {
  var username: String = _
  var age: Int = _
}