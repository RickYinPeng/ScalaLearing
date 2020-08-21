package com.rickyin.bigdata.scala.chapter04

/**
 * 流程控制
 */
object Scala01_Process {
  def main(args: Array[String]): Unit = {
    /**
     * 单分支
     */
    var flag = true
    if (flag) {
      println(true)
    }

    /**
     * 双分支
     */
    if (!flag) {
      println(true)
    } else {
      println(false)
    }

    /**
     * 多分支
     * 字符串可以使用我们的双等号比较，但一般还是使用 equals 比较
     */
    var s = "a"
    if ("a".equals(s)) {
      println("aaa")
    } else if ("b".equals(s)) {
      println("bbb")
    } else {
      println("ccc")
    }

    var x = 4
    var y = 1
    if (x > 2) {
      if (y > 2)
        println(x + y)
      println("rickyin")
    } else {
      println("x is " + x)
    }


  }
}
