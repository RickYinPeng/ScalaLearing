package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO 类的方法
 *     1.所谓的方法,其实就是类中声明的函数,所以声明方式和函数一样,但是调用方式上有区别
 *     2.当方法只有一个参数时,我们可以省略 .() : user login() = user.login(); user.+("xxxx") = user + "xxx"
 */
object Scala07_Method {
  def main(args: Array[String]): Unit = {
    //创建对象
    val user = new User07
    user.login()
    val str = user.+("xxxx") // == user + ("xxxx")
    println(str)



    user login()
    user login
  }
}

class User07 {
  //登录方法
  def login(): Unit = {
    println("xxx")
  }
  //登出方法,方法一般不简化
  def logout(): Boolean = {
    true
  }
}