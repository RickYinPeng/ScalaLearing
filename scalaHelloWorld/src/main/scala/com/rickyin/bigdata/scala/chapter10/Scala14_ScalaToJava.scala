package com.rickyin.bigdata.scala.chapter10

import java.util

import scala.collection.mutable.ArrayBuffer


object Scala14_ScalaToJava {
  def main(args: Array[String]): Unit = {

    println("------------------Scala可变数组转换为Java中List")
    val scalaArr = ArrayBuffer("1", "2", "3", "4")

    import scala.collection.JavaConversions.bufferAsJavaList //TODO 数字报错 bufferAsJavaList隐式转换要求是字符串数组
    val javaArr: ProcessBuilder = new ProcessBuilder(scalaArr)
    val arrlist: util.List[String] = javaArr.command()

    println(arrlist)
    println("------------------Java中List转换成Scala中的可变数组")

    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable
    val scalaArr2: mutable.Buffer[String] = arrlist
    scalaArr2.append("jack")
    println(scalaArr2)
  }
}
