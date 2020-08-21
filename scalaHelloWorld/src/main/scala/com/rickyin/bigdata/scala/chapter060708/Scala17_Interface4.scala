package com.rickyin.bigdata.scala.chapter060708
/**
 * TODO 特质
 *    1.动态混入特质,就是在运行中混入特质,扩展性非常强
 *      val mySql = new Mysql17() with Operate17
 */
object Scala17_Interface4 {
  def main(args: Array[String]): Unit = {
    //val mysql = new Mysql17()

    //动态混入,扩展性非常强
    val mySql = new Mysql17() with Operate17
    mySql.insert()
  }
}

trait Operate17 {
  def insert(): Unit = {
    println("插入数据")
  }
}
class Mysql17  {

}


