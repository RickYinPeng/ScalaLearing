package com.rickyin.bigdata.scala.chapter02

/**
 * 变量
 */
object Scala01_Var {

  /**
   * 在方法外部声明的变量如果采用 val 关键字，等同于使用 final 修饰
   */
  val sex: String = "男"

  def main(args: Array[String]): Unit = {
    /**
     * java 局部变量(方法内部的变量)
     * int i = 10;
     */

    /**
     * Scala 声明变量
     * var 变量名称 : 变量类型 = 变量的值
     */
    //var name: String = "rickyin"

    /**
     * Scala声明变量必须显示的初始化,不然会报错，如下
     */
    //var name:String
    //name = "rickyin" 会报错


    /**
     * Scala中使用 var 声明的变量可以修改，使用 val 声明的变量的值无法修改
     */
    var age: Int = 10
    age = 20
    //var c: Char = 'c'
    //var b: Boolean = true
    val name: String = "rickyin"
    //name = "lisi" 这一句会报错，因为name使用的 val 修饰

  }
}
