package com.rickyin.bigdata.scala.chapter12

import scala.collection.GenTraversableOnce

/**
 * TODO 模式匹配
 *  说一下下划线的用处:
 *    1.模式匹配的其他场合 如: case _ => println("oper error")
 *    2.系统给变量赋初始值
 *    3.类似与Java导包的星号
 *    4.给类起别名
 *    5.隐藏类
 *    6.代替方法的参数
 *    7.可以让函数不执行 如: 返回一个函数的时候需要加下划线
 */
object Scala01_Match {
  def main(args: Array[String]): Unit = {
    println("------------------------模式匹配")
    val oper = '*'
    val n1 = 20
    val n2 = 10
    var res = 0
    oper match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("oper error")
    }
    println("res=" + res)

    println("------------------------下划线用法")
    val list: List[List[Int]] = List(List(1, 2), List(3, 4))
    //变成 List(1,2,3,4)
    val flatlist: List[Int] = list.flatMap(x => x)
    println(flatlist) //打印: List(1,2,3,4)

    /**
     * TODO
     *    之前说过,当参数只使用一次时,可以用下划线代替(参数如果只用一次,可以用下划线代替,Scala的简洁之处,记住是只用一次,不是只有一个参数)
     *    在这里这种用法就不行了,打印的是 <function1>,Scala在这里推断不出来了,为什么推断不出来了呢?继续往下看
     */
    val intsToOnceToList: (List[Int] => GenTraversableOnce[Nothing]) => List[Nothing] = list.flatMap(_)
    println(intsToOnceToList) //打印: <function1>

    /**
     * TODO
     *    list.flatMap()在这里的参数是: f:List[Int] => GenTraversableOnce[B] (将函数作为参数)
     *    而 GenTraversableOnce[+A] extends Any 所以可以返回任意类型
     */
    //我们声明这样一个函数
    def test(list: List[Int]): List[Int] ={
      list
    }
    val list1: List[Int] = list.flatMap(test)
    println(list1) //打印: List(1, 2, 3, 4),在这里没有错

    /**
     * TODO 在这里加了下划线，就等同于将 test 这个函数本身传进去,跟上面直接传test是一样的,这里下划线代的是函数,但是下划线也能代替参数,所以这里
     *      不能使用下划线的原因就是,scala不能正确的推断了,到底是函数还是参数?
     */
    val list2: List[Int] = list.flatMap(test _)
    println(list2) //打印: List(1, 2, 3, 4)

    println("------------------------")
    val strings: List[String] = List("Hello Scala", "Hello World")
    //变成 List("Hello","Scala","Hello","World")
    val strings2: List[String] = strings.flatMap((string) => {
      val strings1: Array[String] = string.split(" ")
      strings1
    })
  }
}
