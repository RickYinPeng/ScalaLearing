package com.rickyin.bigdata.scala.chapter05

/**
 * 函数式编程 - 扩展
 */
object Scala04_FunctionHard {
  def main(args: Array[String]): Unit = {
    /**
     * TODO 可变参数: *
     * 调用函数时,可传多个参数,也可以不传
     *
     * def test(name: String*): Unit = {
     *  println(name)
     * }
     * test("rickyin", "hcy")//打印: WrappedArray(rickyin, hcy)
     * test()//打印: List()
     */

    /**
     * TODO 默认参数
     * 如果希望我们的函数中的某一个参数使用默认值,那么可以在声明时直接赋初始值
     */
    def test(name: String, age: Int = 20): Unit = {
      println(s"${name}-${age}")
    }
    test("rickyin")
    test("rickyin", 30)

    /**
     * 调用函数时,参数匹配规则为从前到后,从左到右
     */
    def test1(name2: String = "xxx",name1: String): Unit = {
      println(s"${name1}-${name2}")
    }
    //下面这行代码会报错,因为我们函数第一个是一个默认参数有默认值,第二个是个必须的参数,但是我们这里调用的时候只有一个参数,它会认为这个参数是给第一个参数的
    //test1("rickyin")

    /**
     * TODO 为了解决上面描述的问题,出现了带名参数
     */
    test1(name1 = "rickyin")

  }
}
