package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO 构造方法
 *  java中的构造方法
 *  class User{
 *    private String name
 *    //默认给的,不写也可以
 *    public User(){
 *    }
 *    //Java中如果你自定义了构造方法,那么默认的无参构造方法就不会再有了,你需要自己添加无参构造
 *    public User(String name){
 *      this(name,"xxxx") // 调用另外一个构造方法需要使用 this 关键字
 *    }
 *    public User(Stirng name,String password){
 *      xxx
 *    }
 *  }
 */

object Scala09_Method2 {
  def main(args: Array[String]): Unit = {
    //创建对象
    //val user = new User09("rickyin")
    val user = new User09
    println(user)
  }
}

/**
 * TODO Scala的构造方法分为两类: 主构造方法 和 辅助构造方法(用来辅助主构造方法的)
 *   1.Scala构建对象可以通过辅助构造方法创建,但是最终必须调用主构造方法
 *   2.Scala是完全面向函数的语言,所以类也是函数
 *   3.类是函数,可以使用小括号作为函数的参数列表
 *   4.类所代表的函数其实就是这个类的构造方法
 *   5.默认情况下,Scala也是给类提供无参构造方法,所以可以省略小括号,如: val user = new User09
 *   6.在类的后面声明的构造方法就是主构造方法
 *   7.在主构造方法中声明的构造方法就是辅助构造方法,注意: 方法名为 this
 *   8.构造方法调用其他构造方法时,应该保证被调用的构造方法已经声明过(就是要在他之前写好)
 */
class User09(s: String) {
  println("主构造方法")
  //类体 = 构造方法体(两者等价)
  println(s) // 这行代码其实是相当于再 User09 类的构造方法的方法体,所以可以执行

  def this(s: String, ss: String) {
    this(s)
    println("辅助构造方法2")
  }
  //声明辅助构造方法,方法名为 this
  def this() {
    this("辅助构造方法1","xxx")
  }

}