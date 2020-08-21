package com.rickyin.bigdata.scala.chapter10

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * TODO 序列(Seq)
 *    1.默认Scala提供的集合都是不可变的(immutable)
 */
object Scala03_Seq {
  def main(args: Array[String]): Unit = {
    /**
     * TODO 不可变集合 List
     */
    val list: List[Int] = List(1, 2, 3, 4) //不可变的
    val list2: List[Int] = List(5, 6, 7, 8) //不可变的
    println("---------------------通过索引获取数据")
    //通过索引获取数据
    println(list(0))
    println("---------------------增加数据")
    //增加数据
    val list1: List[Int] = list :+ 5 //添加到集合最后
    list1.foreach(println)
    println(list == list1) // 因为是不可变的,增加的数据相当于新产生了一个 List
    println("---------------------操作:++,将整个集合添加进去")
    //val list3: List[Int] = list.++(list2) 下面是简写
    val list3: List[Int] = list ++ list2
    println(list3.mkString(","))
    println("---------------------操作 ::")
    val list4: List[Int] = list.::(9)
    //List中的冒号运算符的运算顺序是从右到左
    val list5: List[Int] = 7 :: 8 :: 9 :: list
    println(list4.mkString(","))
    println(list5.mkString(","))
    println("---------------------操作:::")
    val list6: List[Any] = 9 :: list1 :: list
    //并不是将 list1 这个集合的元素放进去,而是将集合本身作为元素放了进去,那我们该如何放元素呢??
    println(list6.mkString(",")) //打印结果: 9,List(1, 2, 3, 4, 5),1,2,3,4
    //集合和集合之间使用三个冒号
    val list7: List[Int] = 9 :: list1 ::: list
    println(list7.mkString(","))
    println("---------------------特殊List集合: Nil(空集合)")
    println(List())
    println(Nil)
    val list8: List[Int] = 1 :: 2 :: 3 :: Nil
    println(list8) // 打印 List(1, 2, 3)
    println("---------------------修改")
    val list9: List[Int] = list.updated(2, 5)
    list9.foreach(println)
    println("---------------------删除数据")
    val list10: List[Int] = list.drop(2) //删除两个元素,从首部开始
    println(list10.mkString(","))

    println("---------------------ListBuffer")
    /**
     * TODO 可变集合 ListBuffer
     */
    val listBuffer: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
    //listBuffer.insert()
    //listBuffer.drop()
    //listBuffer.remove()

    //集合的属性
    //头
    println(listBuffer.head) // 打印: 1
    //尾(除了头以外)
    println(listBuffer.tail) // 打印: ListBuffer(2, 3, 4)
    //最后
    println(listBuffer.last) // 打印: 4
    //初始化(除了最后一个)
    println(listBuffer.init)

    println("---------------------Queue")
    /**
     * TODO 队列: 必须可变,你要往里面放数据啊,所以要可变
     */
    val q: mutable.Queue[Int] = mutable.Queue(1, 2, 3, 4)
    q.enqueue(5)
    println(q)
    val i: Int = q.dequeue()
    println(i)
  }
}
