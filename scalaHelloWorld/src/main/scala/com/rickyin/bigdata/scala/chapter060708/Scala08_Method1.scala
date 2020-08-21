package com.rickyin.bigdata.scala.chapter060708

object Scala08_Method1 {
  def main(args: Array[String]): Unit = {
    /**
     * 采用伴生对象来创建伴生类,可以省略new关键字了
     */
    val student= Student("rickyin")// 相当于自动去调用了 Student.apply方法
  }
}
