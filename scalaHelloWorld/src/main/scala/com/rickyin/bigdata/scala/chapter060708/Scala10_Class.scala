package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO 类
 *  1.Scala中类的继承和抽象
 *  2.Scala中继承类还是采用 extends 关键字和Java中一样
 *  3.Scala中抽象类还是采用 abstract 关键字
 *  4.Scala抽象类中可以声明抽象方法: 方法只有声明没有实现就叫做抽象方法 如: def test()
 *  5.如果子类继承了抽象类,那么必须实现抽象类中的方法,不然会报错
 *  6.只有抽象类中才能有抽象方法,如果不是抽象类,而你去声明抽象方法就会报错
 *  7.Scala如果子类重写父类的方法(不是抽象),需要增加 override 关键字
 *  8.Scala中属性也可以重写,因为属性可以抽象,不初始化属性就是抽象属性,不过同上,抽象属性只能在抽象类中定义 如: var sex :String
 *  9.重写已经初始化的属性,但是不能重写父类 var 声明的变量,也就是说父类的 email 属性必须使用 val修饰,子类也一样要用val修饰
 *  10.为什么要用 val 修饰呢? 其实还是Java的原因,Java中没有重写属性这么一说
 */
object Scala10_Class {
  def main(args: Array[String]): Unit = {
    val user = new User10
    user.name
    user.test1()

    //多态操作
    val user1:Person = new User10
    user1.test1()
    println(user1.email)
  }
}

//声明类
//父类,继承
//类可以声明为抽象的: abstract
abstract class Person {

  //Scala中属性也可以重写,因为属性可以抽象
  var name:String = _
  var sex :String
  val email :String = "zzzzz"

  //只有抽象类中才能有抽象方法,声明抽象方法,方法只有声明没有实现就叫做抽象方法,不需要 abstract 关键字声明
  def test()
  def test1():Unit = {
    println("Person")
  }
}
class User10 extends Person {
  //重写抽象属性
  override var sex: String = _
  //重写已经初始化的属性,但是不能重写父类 var 声明的变量,也就是说父类的 email 属性必须使用 val修饰,子类也一样要用val修饰
  override val email:String = "xxxx"

  //重写抽象方法: 补全方法
  def test():Unit = {
    println("xxxx")
  }

  //Todo Scala如果子类重写父类的方法(不是抽象),需要增加 override 关键字
  override def test1(): Unit ={
    println("child")
  }
}
