package com.rickyin.bigdata.scala.chapter09

/**
 * TODO 隐式转换(注意如果在参数列表前面加了 implicit 代表参数列表里面的所有参数都是隐式参数(之前没有想到这))
 *    1.不想每回都传这个参数,我就只想写 test,我们可以使用默认值的方式,但是使用了默认值之后我们就不能再去改变它的值了,如果我们的业务变化,值也需要变化
 *    2.我们可以使用隐式参数: implicit
 *    3.参数前面加了 implicit 之后,如果我们有隐式值的话我们就传进来,如果没有就使用默认的
 *    4.方法调用时,如果使用小括号会导致隐式值无法传递 如: test() 还会使用参数的默认值,而不是隐式值
 *    5.方法调用时,不使用小括号可以传递隐式值 如: test
 *    6.如果有两个隐式值,那么传递的时候就不知道传递哪个,会报错
 *    7.如果隐式值的数据类型和隐式参数的数据类型不匹配的话,会使用默认值,如果没有默认值会报错,隐式转换其实就是转换的是数据类型
 */
object Scala03_Transform2 {
  def main(args: Array[String]): Unit = {

    //隐式值
    implicit var username:String = "wangwu"
    implicit var age: Int = 10

    //隐式参数
    def test(implicit name: String = "rickyin"): Unit = {
      println("Hello " + name)
    }

    def test1(implicit name: String): Unit = {
      println("Hello " + name)
    }
    //不想每回都传这个参数,我就只想写 test,我们可以使用默认值的方式,但是使用了默认值之后我们就不能再去改变它的值了,如果我们的业务变化,值也需要变化
    //我们可以使用隐式参数: implicit
    //参数前面加了 implicit 之后,如果我们有隐式值的话我们就传进来,如果没有就使用默认的
    test("hcy") //不使用默认值,使用传入的值,跟隐式值没有关系

    test()  //方法调用时,如果使用小括号会导致隐式值无法传递 如: test() 还会使用参数的默认值,而不是隐式值
    test   // 方法调用时,不使用小括号可以传递隐式值,那么就会在
    test1 // 会将当前对象下的隐式值传入 test1 就是将 wangwu 传入 test1

    /**
     * 例子
     */
    def test3(age:Int=10): Unit ={

    }
    // 当没有隐式值，而是默认值时，我们调用函数时,要么不传参数用默认值但是要写上小括号不能省略小括号,要么传参数
    //test3 报错

    //当一个函数中有一个隐式值,和一个普通的参数时
    def test2(implicit kk:String,age:Int): Unit ={
      printf("kk:"+kk)
      printf("age:"+age)
    }
    test2
  }
}