package com.rickyin.bigdata.scala.chapter060708

/**
 * 没有main方法,但是想执行代码在控制台打印,怎么做呢? 继承 App
 */
object Scala20_ClassInfo1 extends App {
  println("zhangsan...")
  Color.RED
}
//枚举(用的特别少)
object Color extends Enumeration{
  //隐式转换
  var RED = Value(1,"Red")
  var Yellow = Value(2,"Yellow")
}