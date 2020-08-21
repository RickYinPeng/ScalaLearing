package com.rickyin.bigdata.scala.chapter09

/**
 * TODO 隐式转换
 *    1.扩展功能: 通过隐式转换将 Mysql 类型转换为 Operater,从而拥有 Operater 的方法
 */
object Scala02_Transform1 {
  def main(args: Array[String]): Unit = {

    implicit def transform(mysql: Mysql): Operater = {
      new Operater
    }

    val mysql = new Mysql
    mysql.select()

    /**
     * 通过隐式转换将 Mysql 类型转换为 Operater,从而拥有 Operater 的方法
     */
    mysql.delete()
  }
}

class Operater {
  def delete(): Unit = {
  }
}

class Mysql {
  def select(): Unit = {
  }
}