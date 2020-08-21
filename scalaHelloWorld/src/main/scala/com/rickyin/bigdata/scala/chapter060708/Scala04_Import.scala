package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO import
 *        1.用于导入类
 *        2.可以在任意的地方使用
 *        3.可以导入一个包中的所有类,采用下划线代替星号: import java.util._
 *        4.导入相同包中的多个类,采用大括号进行包含处理: import java.util.{ArrayList,List,Date}
 *        5.import可以采用特殊的方式来隐藏指定的类: {类名=>_} 例: import java.util.{Date=>_}
 *        6.import可以导包,在Java中我们导的其实是类不是包,但是我们经常把它叫做导包,在Scala中是可以导包的 例: import java.util
 *        7.Scala中可以在导入类的时候可以给类起别名 例: import java.util.{HashMap=>JavaHashMap} HashMap的别名为JavaHashMap
 */
//import java.util.{Date=>_}
//import java.sql.Date
import java.util.{HashMap=>JavaHashMap}

object Scala04_Import {
  def main(args: Array[String]): Unit = {
    //import java.util.Date
    //val date = new Date()
    //val date = new util.Date()
    val map = new JavaHashMap()
  }
}

