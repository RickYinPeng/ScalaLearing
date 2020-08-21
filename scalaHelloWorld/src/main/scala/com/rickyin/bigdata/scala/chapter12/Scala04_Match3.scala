package com.rickyin.bigdata.scala.chapter12

/**
 * TODO
 *  匹配数组
 *    1.Array(0): 匹配只有一个元素且为0的数组
 *    2.Array(x,y): 匹配数组有两个元素,并将两个元素赋值为x和y。当然可以依次类推Array(x,y,z)匹配数组有3个元素
 *    3.Array(0,_*): 匹配数组以0开始
 *  List匹配
 *    1.0 :: Nil : Nil是空List的意思,所以是在空List中的前部加上0就是 List(0)
 *    2.x :: y :: Nil : List中有两个元素
 *    3.0 :: tail: 以0开头的List,tail的意思是尾部
 *  匹配元组
 *    1.case中对象的 unapply 方法(对象提取器)返回Some集合则为匹配成功
 *    2.返回 none 集合则为匹配失败
 */
object Scala04_Match3 {
  def main(args: Array[String]): Unit = {
    println("-------------------匹配数组")

    /**
     * TODO 匹配数组
     */
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + "=" + y
        case Array(0, _*) => "以0开头的数组"
        case _ => "什么集合都不是"
      }
      println("result=" + result)
    }

    println("-------------------List匹配")

    /**
     * TODO List匹配
     */
    for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
      val result = list match {
        case 0 :: Nil => "0"
        case x :: y :: Nil => x + " " + y
        case 0 :: tail => "0...."
        case _ => "something else"
      }
      println(result)
    }

    println("-------------------对象匹配")
    /**
     * TODO 对象匹配
     */
    object Square {
      def unapply(z: Double): Option[Double] = Some(math.sqrt(z))
      def apply(z: Double): Double = z * z
    }
    val number:Double = 36.0
    number match {
      case Square(n) => println(n)
      case _ => println("nothing matched")
    }

  }
}
