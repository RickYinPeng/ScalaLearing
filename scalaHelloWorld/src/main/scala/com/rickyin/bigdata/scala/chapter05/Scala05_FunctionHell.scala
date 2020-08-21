package com.rickyin.bigdata.scala.chapter05

/**
 * 函数式编程 - 地狱版本
 */
object Scala05_FunctionHell {

  def main(args: Array[String]): Unit = {
    /**
     * TODO Scala是完全面向函数式的编程语言(也是完全面向对象的,多范式)
     */

    /**
     * TODO 函数在Scala中可以做任何事情
     * 1.函数可以赋值给变量
     * 2.函数可以作为函数的参数
     * 3.函数可以作为函数的返回值
     */

    //---------------------------函数可以作为函数的返回值---------------------------

    def f():Unit = {
      println("function")
    }
    def f0() = { // 这里这样写的原因是，如果可以根据函数的最后一行代码推断出类型,那么函数返回值类型可以省略
      // 返回函数: 这里指的是返回函数本身,而不是函数执行的结果
      // 直接返回函数,有问题,需要增加特殊符号:  _
      f _
    }
    f0()() //TODO f0()代表的是返回的 f() 函数, f0()()就代表执行 f 函数


    def f1(i: Int) = {
      def f2(j: Int): Int = {
        i * j
      }
      f2 _
    }
    println(f1(2)(3))

    //上面代码的简化版
    //TODO 函数柯里化
    def f3(i:Int)(j:Int) : Int = {
        i*j
    }
    println(f3(2)(3))

    /**
     * TODO 闭包: 一个函数在实现逻辑时,将外部的变量引入到函数的内部,改变了这个变量的生命周期,称之为闭包
     */
    def f4(i: Int) = {
      def f5(j: Int,k:Int): Int = {
        i * j
      }
      f5 _
    }

    //---------------------------函数可以作为函数的参数---------------------------
    /**
     * TODO 将函数作为参数传递给另外一个函数,需要采用特殊的声明方式: ()=>Unit  参数列表=>返回值类型
     */
    def f5(f: () => Int): Int = {
      f() + 10
    }
    def f6(): Int = {
      5
    }
    println(f5(f6))

    def f8(f: (Int) => Unit): Unit = {
      f(10)
    }
    def f9(i:Int):Unit = {
      println(i)
    }
    f8(f9)

    /**
     * 使用匿名函数来改善代码
     */
    def f7(f:()=>Unit): Unit = {
      f()
    }
    f7(()=>{})
    //匿名函数的几种写法
    f8((i:Int) =>{println(i)})
    f8((i)=>{println(i)})//不写类型也可以,因为会自动推断
    f8((i)=>println(i))//因为函数体只有一行代码,所以可以省略大括号
    f8(println(_))//参数如果只用一次,可以用下划线代替,Scala的简洁之处,记住是只用一次,不是只有一个参数
    f8(println)//只有一个参数,可以直接不用写

    def f10(f: (Int, Int) => Int): Int = {
      f(10, 10)
    }
//    def f11(i: Int, j: Int): Int = {
//      i+j
//    }
    //println(f10(f11)) // 第一种写法
    println(f10((i:Int,j:Int)=>{i+j}))
    println(f10((i,j)=>{i+j}))
    println(f10((i,j)=>i+j))
    println(f10(_+_))  //参数如果只用一次,可以用下划线代替,Scala的简洁之处,记住是只用一次,不是只有一个参数
  }
}
