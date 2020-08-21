package com.rickyin.bigdata.scala.chapter01

object Scala01_HelloWorld {

  //scala 源码中包含了main方法,在编译后自动形成了 public static void main
  //Scala 在编译时，会生成两个字节码文件，静态main方法执行另外一个字节码文件中的成员main方法
  //Scala 是完全面向对象的语言，那么它没有静态的语法，只能通过模拟生成静态方法
  //编译时将当前类生成一个特殊的类 ==> Scala01_HelloWorld$ ,然后创建对象来调用这个对象的main方法

  //一般情况下，将加 $ 的对象叫做 "伴生对象" ,伴生对象中的内容，都可以通过类名访问,来模拟Java中的语法

  //伴生对象的语法规则: object

  //public static void main(String[] args) { 方法体 }
  //scala中没有public关键字，默认所有的访问权限都是公共的(public)
  //scala中没有void关键字，采用特殊对象模拟: Unit
  //scala中声明方法采用关键字 def

  //方法后面的小括号是方法的参数列表
  //scala中参数列表的声明方式和Java不太一样

  //java : String 参数名
  //scala: 参数名 : 类型

  //java中方法的声明和方法体直接连接
  //scala中方法的声明和方法体是通过等号连接

  //scala 中将方法的返回值类型放置在方法声明的后面使用冒号连接

  //scala能省则省
  def main(args: Array[String]): Unit = {
    println("Hello World")
    Scala01_HelloWorld.test();
  }

  var name:String = "rickyin"

  def test(): Unit = {

  }
}
