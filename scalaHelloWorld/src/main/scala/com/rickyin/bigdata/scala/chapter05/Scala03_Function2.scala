package com.rickyin.bigdata.scala.chapter05

object Scala03_Function2 {
  def main(args: Array[String]): Unit = {
    //TODO Scala可以采用自动推断功能来简化函数的声明

    /**
     * 1.如果函数声明时,明确无返回值，那么即使函数体中有 return 也不起作用
     *    def test(): Unit = {
     *      //println("Hello Scala")
     *      return "rickyin"
     *    }
     *    println(test())// 打印: ()
     */

    /**
     * 2.如果将函数体的最后一行代码进行返回,那么return关键字可以省略
     *    def test(): String = {
     *      //return "rickyin"
     *      "rickyin"
     *    }
     *    println(test())
     */

    /**
     * 3.如果可以根据函数的最后一行代码推断出类型,那么函数返回值类型可以省略
     *    def test() = {
     *      "rickyin"
     *    }
     *    println(test())
     */

    /**
     * 4.如果整个函数体当中只有一行代码,大括号可以省略
     *     def test() = "rickyin"
     *    println(test())
     */

    /**
     * 5.如果函数声明中没有参数列表,小括号可以省略
     *    def test = "rickyin"
     *    println(test) // 如果函数小括号省略了,那么访问函数时不能增加小括号
     * TODO 声明函数必须增加 def
     */

    /**
     * 6.如果明确函数没有返回值,那么等号可以省略,省略后,编译器不会将函数体最后一行代码作为返回值
     */
    def test {
      "asd"
    }
    println(test) // 打印 ()
  }
}
