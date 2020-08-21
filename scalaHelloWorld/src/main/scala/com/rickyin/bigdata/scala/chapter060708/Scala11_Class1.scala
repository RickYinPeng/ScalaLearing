package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO 父类构造方法
 *  1.Java中在子父类中,我们通过子类的构造函数创建子类的时候会先调用父类的构造函数创建父类的实例,这是通过 super()方法实现的,不过我们在构造函数中看
 *    不到调用 super() 的代码,就是说 super() 方法相当于调用了父类的无参构造方法
 *  2.但是如果父类中我们声明了一个有参的构造函数,那怎么办呢？ 我们知道Java中如果我们不写构造方法,默认会给我们的类有个无参构造函数,但是如果我们写了‘
 *    构造函数(显示的写了,不管写的是有参还是无参),那么就不再拥有那个默认的无参构造了,如果我们写的是无参构造,那么 super() 方法还是起作用的,super()
 *    方法就是调用无参构造啊,但是如果你在父类中写的是有参构造,那么就需要使用 super("xxx","xxx") 去调用父类的构造方法
 *  3.Scala中因为类就是构造方法,如: class Person11(s: String),如果Scala的构造方法是有参的,那么需要我们也去传入参数
 *    class User11() extends Person11("rick") 可以在继承的父类后面增加小括号,传递参数,等同于调用父类构造方法
 *    就是说 如果父类主构造方法有参数,那么构建对象时必须显示的传递参数
 */
object Scala11_Class1 {
  def main(args: Array[String]): Unit = {
    val user = new User11("rickyin")
  }
}

class Person11(s: String) {
  println("Person 主构造方法 = " + s)
}

//如果父类主构造方法有参数,那么构建对象时必须显示的传递参数
//可以在继承的父类后面增加小括号,传递参数,等同于调用父类构造方法
class User11() extends Person11("rick") {
  println("User 主构造方法")

  def this(s: String) {
    this()
    println("User 辅助构造方法")
  }
}