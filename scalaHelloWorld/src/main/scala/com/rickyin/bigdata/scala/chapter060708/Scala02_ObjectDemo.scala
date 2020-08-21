package com.rickyin.bigdata.scala.chapter060708


object Scala02_ObjectDemo {
  def main(args: Array[String]): Unit = {
    //创建类的对象
    val user: User = new User()
    //调用对象的属性或方法
    user.username = "rickyin"
    println(user.username) //打印: com.rickyin.bigdata.scala.chapter060708.User@6adca536
  }
}

//声明类
class User {
  //声明属性
  var username: String = _
  /**
   * 因为Scala需要显示的赋初始值,所以为了解决这个问题,Scala中可以使用下划线 _
   */
  var age: Int = _

  def login(): Boolean = {
    true
  }
}
