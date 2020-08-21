package com.rickyin.bigdata.scala.chapter060708

/**
 * Scala中的包的声明方式默认和Java是一致的,但是有其他的使用方式
 * 1.在同一个源码文件中可以多次声明,在Java中是不行的,声明的类在最后的那个包中,源码中的类所在的位置不需要和包路径相同
 * 2.Scala中所有的语法都可以进行嵌套
 *   package也可以嵌套,就像下面这样,如果package不嵌套只有一层的话,是对最上面package的一个组合,在最上面的package后面加上它
 *   package可以使用小括号,小括号内声明的类在这个包中,之外声明的类不在这个包中
 * 3.Scala中可以声明父包和子包,父包中的类,子类可以直接访问,不需要引入,其实就是作用域的概念
 * 4.Scala中在package中可以声明类,但是无法声明变量和函数(方法)
 * 5.Scala为了弥补包的不足,使用了包对象的概念(包也被当做对象)
 */
package test {
  class Emp {
  }

  /**
   * Scala为了弥补包的不足,使用了包对象的概念(包也被当做对象)
   */
  package object test{
    val test = "123"
    def test1(){
    }
  }

  /*
  Scala中在package中可以声明类,但是无法声明变量和函数(方法)
  val test = "123"
  def test1(){}
   */
  package test1 {
    object Scala03_Package {
      def main(args: Array[String]): Unit = {
        //Scala中可以声明父包和子包,父包中的类,子类可以直接访问,不需要引入,其实就是作用域的概念
        val emp = new Emp
        println(emp)
      }
    }
  }
}

