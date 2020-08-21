package com.rickyin.bigdata.scala.chapter12

/**
 * TODO 类型匹配: 可以匹配对象的任意类型,这样做避免了使用 isInstanceOf 和 asInstanceOf 方法
 *  类型匹配注意: Map[String,Int]和Map[Int,String]是两种不同的类型,但是Scala在这里却不能识别泛型,但是Array[Int]可以识别
 */
object Scala03_Match2 {
  def main(args: Array[String]): Unit = {
    val a = 7
    val obj = if (a == 1) 1
              else if (a == 2) "2"
              else if (a == 3) BigInt(3)
              else if (a == 4) Map("aa" -> 1)
              else if (a == 5) Map(1 -> "aa")
              else if (a == 6) Array(1, 2, 3)
              else if (a == 7) Array("aa", 1)
              else if (a == 8) Array("aa")

    /**
     * TODO 如果在case关键字后面跟变量名,那么match前表达式的值会赋给那个变量
     *  如果obj是Int类型的,就将obj的值给a,如果obj是Map[String,Int]类型就将obj给b
     */
    val result = obj match {
      case a: Int => a
      case b: Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c: Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d: Array[String] => "对象是一个字符串数组"
      case e: Array[Int] => "对象是一个数字数组"
      case f: BigInt => Int.MaxValue
      case _ => "啥也不是"
    }
  }

}
