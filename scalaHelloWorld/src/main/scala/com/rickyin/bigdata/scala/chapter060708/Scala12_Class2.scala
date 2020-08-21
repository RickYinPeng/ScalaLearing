package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO 构造方法的参数
 *  1.在我们的Java中,我们在构造函数中有参数的话,一般是将这个参数赋值给我们这个对象的成员变量,以便其他方法使用
 *  2.而在我们Scala中我们如果只是在构造函数上声明它,虽然在主构造方法体内部我们可以使用它(因为Scala中类就是对象就是主构造方法),但是在外部我们new
 *    出来的对象是无法使用它的,只能在内部使用
 *    class User12(name: String) {
 *      name的作用域是整个,因为这整个其实相当于对象的主构造方法
 *    }
 *    val user = new User12("123")
 *    user.name 就会报错
 *  3.我们也可以这样
 *    class User12(name: String) {
 *      var name: String = s
 *    }
 *    val user = new User12("123")
 *    user.name
 *  4.Scala特有的方式
 *    class User12(var name: String) { //用 var 声明,也可以用 val 声明,不过有区别
 *    }
 *    用val声明Scala会将参数作为类的私有的只读属性(只有 getter 方法)
 *    用var声明Scala会将参数作为类的成员属性使用,并且会提供对应的 setter 和 getter 方法,即这时的成员属性是私有的,但是可以读写
 */
object Scala12_Class2 {
  def main(args: Array[String]): Unit = {
    val user = new User12("123")
    println(user.name)
  }
}
//类构造方法的参数的作用域默认为整个类的主体,但是如果想要参数作为属性来使用,可以采用特殊方式: var、val
class User12(var name: String) {
  //var name: String = s
}