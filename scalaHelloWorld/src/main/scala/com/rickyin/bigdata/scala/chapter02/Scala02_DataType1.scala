package com.rickyin.bigdata.scala.chapter02

object Scala02_DataType1 {
  def main(args: Array[String]): Unit = {
    /**
     * Int => Double : Int转换为Double
     */
    val i: Int = 10; //将 10 变为 10.0
    //可以这样
    val d1: Double = i
    val d2 = i.toDouble
    d2.toInt
    println(d1)
    println(d2)

    /**
     * Unit:表示无值，就是Java中的 void 类型。用作不返回任何结果的方法的结果类型。Unit只有一个实例值
     */
    println(Unit) //object scala.Unit

    /**
     * Null:Null类型只有一个实例值 null
     */
    val s: String = null
    println(s)

    /**
     * Scala中Null类只有一个实例对象null。类似与Java中的null引用。null可以赋值给任意的引用类型(AnyRef),但是不能赋值给值类型(AnyVal:Int、Float、Char、Boolean、Long、Double、Byte、Short)
     * 比如下面这行代码会报错
     * val ii: Int = null
     * Error:(25, 19) an expression of type Null is ineligible for implicit conversion
     * val ii: Int = null
     */
    f1()
  }

  /**
   * Nothing:返回结果不正常（指的是有错误）
   *
   * @return
   */
  def f1(): Nothing = {
    throw new Exception()
  }
}
