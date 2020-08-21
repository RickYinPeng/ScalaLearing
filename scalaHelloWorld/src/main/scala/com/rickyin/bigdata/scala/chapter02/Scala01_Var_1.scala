package com.rickyin.bigdata.scala.chapter02

/**
 * 变量
 *  自动类型推断
 */
object Scala01_Var_1 {

  def main(args: Array[String]): Unit = {
    /**
     * 能省则省
     * Scala为了让开发过程变得简单，可以将自动推断出来的省略
     */
    val username: String = "rickyin"
    val name = "rickyin"
    println(name)

    /**
     * var修饰的对象引用可以改变，val修饰的则不可改变，但对象的状态(值)却是可以改变的
     */
    val dog = new Dog() //dog对象被val修饰所以dog对象这个引用不能改变，比如在下面再写一句 dog = new Dog(); 就会报错
    dog.name = "xxxx" //但dog对象里面的值可以改变
    println(dog.name)
  }
}

class Dog {
  var name: String = "rickyinhah"
}