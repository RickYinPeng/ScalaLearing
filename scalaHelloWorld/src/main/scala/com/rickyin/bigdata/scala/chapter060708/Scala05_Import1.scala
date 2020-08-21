package com.rickyin.bigdata.scala.chapter060708

import _root_.java.util._
/* TODO 因为这里声明了跟jdk一样的包名和类,会影响其他代码,所以我就先注释了,如果后期复习,可以去掉注释

package java {
  package util {
    class HashMap{

    }
    object Scala05_Import1 {
      def main(args: Array[String]): Unit = {
        /**
         * TODO
         *    1.当我们在当前文件中声明了跟jdk一样的包名和类的时候,当我们new对象的时候,new的是我们当前定义的包和类而不是jdk中的，如下面的HashMap
         *    2.就算我们写的全类名来 new 这个对象,new出来的也是我们当前定义的而不是jdk中
         *    3.如何new出jdk中的源对象呢? 导入 _root_(根:包的最顶层的包) 例: import _root_.java.util
         *      val map2 = new _root_.java.util.HashMap
         *    4.Scala中如果想要从最开始的包中查找类,需要增加绝对路径,使用 _root_ 开头
         */
        val map = new HashMap
        val map1 = new java.util.HashMap
        val map2 = new _root_.java.util.HashMap
        println(map2)
      }
    }
  }
}
*/

