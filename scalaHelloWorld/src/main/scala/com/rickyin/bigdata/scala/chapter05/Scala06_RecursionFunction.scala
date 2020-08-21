package com.rickyin.bigdata.scala.chapter05

object Scala06_RecursionFunction {

  def main(args: Array[String]): Unit = {
    /**
     * TODO 递归
     * 1.函数的逻辑代码中调用自身
     * 2.函数在调用自身时,传递的参数应该有规律
     * 3.函数应该有跳出递归的逻辑,否则会出现死循环
     */

    //阶乘
    def !!(i: Int): Int = {
      if (i == 1) {
        1
      } else {
        i * !!(i - 1)
      }
    }
    println(!!(5))

    /**
     * 将函数赋值给变量
     */
    val f = () => {}
    println(f)//打印: <function0> 后面的 0 代表的是方法的参数列表的个数,最大为 22
  }
}
