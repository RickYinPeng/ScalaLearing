package com.rickyin.bigdata.scala.chapter03

object Scala01_Oper {
  def main(args: Array[String]): Unit = {
    /**
     * Scala中没有 ++、--操作符，需要通过 +=、-=来实现同样的效果
      */
    var i = 1
    i += 1
    println(i)

    /**
     * 在Scala中
     * +=、-=：会提升数据类型
     *  var a :Byte = 1
     *  a+=1
     *  println(a)
     *  报错：Error:(16, 6) type mismatch;
     *
     * 在Java中
     *  byte a = 1;
     *  a = a+1;(这里有个隐式转换，会报错)
     * 但是下面这样写不会报错，说明Java中 += 不会存在隐式转换
     *  byte a = 1;
     *  a+=1;
     */
  }
}
