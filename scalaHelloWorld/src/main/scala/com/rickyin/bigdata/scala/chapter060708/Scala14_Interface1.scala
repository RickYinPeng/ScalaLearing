package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO 特质
 *    1.Java中的接口能直接构建对象吗? 不能,除非匿名内部类(说白了这个匿名内部类也是实现类)
 *    2.Scala中的特质也无法构建对象,会报:  Trait 'TestTrait14' is abstract; cannot be instantiated
 *    3.Java中的接口是可以声明方法的,早期版本中声明的方法都是抽象的,新版jdk中是可以有默认实现的(default)
 *    4.Java中的接口是可以声明属性的,但是属性值无法修改是个常量(你想啊,接口是规范,规范中的东西能随便改吗)
 *    5.Scala中的特质可以直接写代码,执行代码,Java中是不行的,不能在接口中直接写代码
 *    6.Scala特质中声明的属性和方法都可以在混入的类中调用
 *    7.Scala特质中可以声明抽象方法,不需要在类名前面加 abstract 关键字
 */
object Scala14_Interface1 {
  def main(args: Array[String]): Unit = {
    //Java中的接口能直接构建对象吗? 不能,除非匿名内部类(说白了这个匿名内部类也是实现类)
    //Scala中的特质也无法构建对象
    //new TestTrait14() Trait 'TestTrait14' is abstract; cannot be instantiated
    val user1 = new User14()
    user1.username = "lisi"
    println(user1.username)
    user1.test()
  }
}

trait TestTrait14 {
  var username :String = "rick"
  println("xxx")
  def test(): Unit ={
    println("test")
  }

  def test1()
}
class Person14 {
}
class User14 extends Person14 with TestTrait14 {
  override def test1(): Unit = {

  }
}