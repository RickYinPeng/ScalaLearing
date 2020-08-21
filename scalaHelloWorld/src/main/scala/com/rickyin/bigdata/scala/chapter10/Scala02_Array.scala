package com.rickyin.bigdata.scala.chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * TODO
 * Java中的数组:
 *        1.声明 如: int[] ints = new int[3]{1,2,3};
 *        2.放值 如: ints[0] = 1
 *        3.取值 如: int i = ints[0]
 * Scala中的数组:
 *        1.使用 Array 对象实现,使用我们的中括号声明数组的类型 如: Array[String]
 *        2.Scala可以使用简单的方式创建数组 如: Array(1,2,3,4)
 *        3.Array通过 apply 方法创建数组对象
 *        4.访问数组: 使用小括号,增加索引的方式来访问数组
 */
object Scala02_Array {
  def main(args: Array[String]): Unit = {
    println("----------------不可变数组Array")
    val ints: Array[Int] = Array(1, 2, 3, 4)
    //访问数组
    println(ints(0))
    //数组的长度
    println(ints.length)

    println(ints) // 打印: [I@6adca536
    //ints.+("")
    println(ints + "sssss") // 打印: [I@6adca536sssss

    println("----------------打印数组内容")
    //将我们的数组转换为字符串打印出来
    println(ints.mkString(","))

    println("----------------for循环打印数组内容")
    //将我们数组中的每个元素打印
    for (elem <- ints) {
      println(elem)
    }
    ints.foreach((x:Int)=>{println(x)})
    println("----------------foreach循环打印数组内容")

    def printlnEm(int: Int): Unit = {
      println(int)
    }
    //foreach方法会将数组中的每一个元素进行循环遍历,执行指定函数实现逻辑
    ints.foreach(printlnEm)
    println("----------------使用匿名函数循环打印数组内容")
    //ints.foreach((i:Int)=>{println(i)}) 匿名函数基础写法
    //ints.foreach((i)=>{println(i)})     匿名函数简化1: 类型自动推断
    //ints.foreach((i)=>println(i))       匿名函数简化2: 匿名函数体内代码只有一行的情况下可以省略大括号
    //ints.foreach(println(_))            匿名函数简化3: 匿名函数的参数只使用了一次
    ints.foreach(println) //匿名函数简化4: 匿名函数只有一个参数,可以直接不用写
    println("----------------修改元素")
    //增加元素
    ints.update(0, 10)
    println(ints(0))
    println("----------------增加元素")
    //采用方法向数组中添加新的元素,但是不会对原有数组造成影响,而实产生新的数组
    val ints1: Array[Int] = ints :+ (5) // 在集合的尾部增加数据,冒号始终靠近数组
    val ints2: Array[Int] = 5 +: (ints) // 在集合的头部增加数据,冒号始终靠近数组
    println(ints1.mkString(","))
    println(ints2.mkString(","))
    println(ints == ints1) // Array是不可变的,这里是新生成了一个数组
    println(ints == ints2) // Array是不可变的,这里是新生成了一个数组

    println("----------------可变数组ArrayBuffer")
    val arrayBuffer: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6, 7)
    //查询值
    println(arrayBuffer(0))
    println("----------------ArrayBuffer修改数据")
    //修改值
    arrayBuffer(0) = 9
    println(arrayBuffer.mkString(","))

    println("----------------ArrayBuffer循环遍历")
    //循环遍历
    arrayBuffer.foreach(println)

    println("----------------ArrayBuffer增加数据")
    val buffer: arrayBuffer.type = arrayBuffer += (9) // 增加元素
    println(arrayBuffer == buffer) //打印: true  说明 buffer 和 arrayBuffer 是同一块内存地址,所以ArrayBuffer是可变的
    arrayBuffer.foreach(println)
    println("----------------ArrayBuffer向指定位置增加数据")
    //arrayBuffer.insert(1, 9)
    println("----------------ArrayBuffer删除指定位置的数据并返回")
    println(arrayBuffer.mkString(","))
    val i: Int = arrayBuffer.remove(1)
    println(i)
    println(arrayBuffer.mkString(","))
    println("----------------ArrayBuffer删除数据,从指定位置开始连续删除几个")
    arrayBuffer.remove(1,2) // 从位置1开始连续删除2个元素
    println(arrayBuffer.mkString(","))
    println("----------------可变数组和不可变数组的转换")
    val buffer1: mutable.Buffer[Int] = ints.toBuffer
    val array: Array[Int] = arrayBuffer.toArray
  }
}
