package com.rickyin.bigdata.scala.chapter02

object Scala03_Name {
  def main(args: Array[String]): Unit = {
    /**
     * Scala中标识符规则(与Java基本一致，不过有些部分还不一样):
     * 1.首字符为字母，后续字符任意字母和数字，美元符号，后可接下划线
     * 2.数字不可以开头
     * 3.首字符为操作符(比如: + - * /),后续字符也需跟操作符(比如: +a 这样就会报错)，至少一个
     * 4.操作符(比如: + - * /)不能在标识符中间和最后
     * 5.用反引号(飘号)`...`包括的任意字符串，即使是关键字(39个)也可以
     */
    val ++ = "123"
    val +-*/ = 123
    val %&@ = "123"
    //Scala中可以使用特殊符号作为标识符，其实是将特殊符号在编译时进行了转换
    println(%&@)

    /**
     * Scala中的下划线有特殊的用途，不能独立当成变量名使用
     * val _ = "123"
     * println(_)
     * 报错:Error:(20, 13) missing parameter type for expanded function ((x$1) => println(x$1))
     * 但是这样却可以使用
     * val _ = "123"
     * val a = "abc"+_
     * println(a)
     * 但是打印的结果却是: <function1>
     */

    /**
     * 当你所使用的标识符名称和关键字名称冲突时就可以使用 ``
     */
    var `private` = "123"
    println(`private`)
  }
}
