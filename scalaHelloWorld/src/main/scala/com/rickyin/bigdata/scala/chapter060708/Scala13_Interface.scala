package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO Scala中没有接口(interface)的概念,有特质(trait)的概念,类似于接口
 *    1.特质可以继承的,所以使用 extends 关键字
 *    2.如果我们的类继承多个特质,采用 with 连接
 */
object Scala13_Interface {
  def main(args: Array[String]): Unit = {
    val user = new User13();
    println(user)
  }
}

//声明特质
trait TestTrait13 {
}

class Person13 {
}

//特质可以继承的,所以使用 extends 关键字
//如果我们的类继承多个特质,采用 with 连接
//如果类同时存在父类和特质,依然采用继承方式,但是继承的是父类,连接(混入)特质,就是说我们需要将父类写在 extends 的后面
class User13 extends Person13 with TestTrait13 {
}