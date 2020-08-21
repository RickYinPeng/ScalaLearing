package com.rickyin.bigdata.scala.chapter12

/**
 * TODO 守卫: 如果想要表达式匹配某个范围的数据,就需要在模式匹配中增加条件守卫
 *  case _ if ch.toString.equals("3") => dight = 3 ： 如果ch是3就走这行代码如果不是就走下面代码 case _ => sign = 2
 *
 */
object Scala02_Match1 {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0;
      var dight = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3") => dight = 3
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + dight)
    }

    /**
     * TODO 将守卫的位置放到上面,不会报错,不过下面的代码就不会再走了,因为这一行可以匹配任意
     */
    for (ch <- "+-3!") {
      var sign = 0;
      var dight = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ => sign = 2 //TODO 将守卫的位置放到上面,不会报错,不过下面的代码就不会再走了,因为这一行可以匹配任意
        case _ if ch.toString.equals("3") => dight = 3
      }
      println(ch + " " + sign + " " + dight)
    }

    /**
     * TODO 如果在case关键字后面跟变量名,那么match前表达式的值会赋给那个变量
     *      mychar = 'V'
     */
    val ch = 'V'
    ch match {
      case '+' => println("ok~")
      case mychar => println("ok~"+mychar) //打印: ok~V
      case _ => println("ok~~")
    }

  }
}
