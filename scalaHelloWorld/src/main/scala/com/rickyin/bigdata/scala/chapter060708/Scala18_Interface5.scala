package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO 特质
 *    1.特质继承类
 *    2.特质使用范围,如果我不想继承 Exception 类,但是我又想拿到异常,该怎么做,我们可以声明特质的使用范围 this:Exception =>,代表特质在有异常的
 *      时候使用
 */
object Scala18_Interface5 {
  def main(args: Array[String]): Unit = {
    val mySql = new Mysql18()
    mySql.getMessage
  }
}

//特质继承类
trait Operate18 /* extends Exception */{

  //特质使用范围,如果我不想继承 Exception 类,但是我又想拿到异常,该怎么做,我们可以声明特质的使用范围
  this:Exception =>
  def insert(): Unit = {
    println("插入数据")
    this.getMessage
  }
}
//如果特质声明了使用范围(异常的时候使用),那我们需要继承 Exception
class Mysql18 extends Exception with Operate18 {

}


