package com.rickyin.bigdata.scala.chapter12

/**
 * TODO 样例类: case class
 *    1.样例类任然是类
 *    2.样例类用case关键字进行声明
 *    3.样例类是为模式匹配(对象)而优化的类
 *    4.构造器中的每一个参数都成为val修饰的,除非它被显示的声明为var
 *        case class Dollar(value:Double) extends Amount
 *        记得我们在将构造函数参数的时候说过,如果在构造函数里面使用 var 或 val 显示的声明构造函数内的参数的时候,这个参数会变为类的属性,不过使用
 *        var修饰有get和set,val修饰的只有get
 *        但是在这里即便我们没有显示的使用 var 或 val修饰构造函数中的参数,它还是会默认帮我们加上 val
 *    5.当一个类被定义成为case类后，Scala会自动帮你创建一个伴生对象,在样例类对应的伴生对象中提供了 apply 方法让你不用 new 关键字就能构造出相应
 *      的对象
 *    6.提供了 unapply 方法让模式匹配工作
 *    7.将自动生成 toString,equals,hashCode和copy方法(有点类似模板类,直接生成,供程序员使用)
 *    8.除上述外,样例类和其他类完全一样。你可以添加方法和字段,扩展他们
 */
object Scala06_Match5 {
  def main(args: Array[String]): Unit = {

    val dollar: Dollar = new Dollar(1.0)
    //dollar.value = 1; 可以拿到但是不能改变,因为默认是 val 修饰的

    //在样例类对应的伴生对象中提供了 apply 方法让你不用 new 关键字就能构造出相应的对象
    val dollar1: Dollar = Dollar(1.0)
    println(dollar1.value)

    //样例类做匹配操作
    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      val result = amt match {
        case Dollar(v) => "$" + v
        case Currency(k, v) => v + " " + v
        case NoAmount => ""
      }
      println(amt + ":" + result)
    }

    //样例类的 copy方法
    val dollar2: Dollar = dollar.copy(2.0) //新的类就是Dollar(2.0)


  }
}

abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount
