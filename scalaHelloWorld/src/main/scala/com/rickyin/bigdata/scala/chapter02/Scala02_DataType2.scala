package com.rickyin.bigdata.scala.chapter02

object Scala02_DataType2 {
  def main(args: Array[String]): Unit = {

    /**
     * 报错
     * var s:Short = 5
     * s = s-2 //这里会报错，转换为Int类型做计算，做完计算转为Short的时候报错(s-2计算完之后是一个Int类型的数据,而s是一个Short类型,所以报错)
     * println(s)
     */

    /**
     * 报错
     * var b:Byte = 3
     * b = b+4  //这里会报错，报错原因和上面一样
     * b = (b+4).toByte //这里不会报错，强制类型转换了
     */

    /**
     * 不会报错
     * var c: Char = 'a'
     * var i: Int = 5
     * var d: Float = .314f
     * var result: Double = c + i + d //Double类型是64位，可以放下
     */

    /**
     * 将 "12.5"转换成 Int 类型，一般会想着可以转换，转换后结果是 12
     * 但是报错：java.lang.NumberFormatException: For input string: "12.5"
     * 在Scala中要这样想，你要转换成Int，但是Int中怎么会有小数点呢，所以转换错误
     * var s = "12.5".toInt
     * println(s)
     */
  }
}
