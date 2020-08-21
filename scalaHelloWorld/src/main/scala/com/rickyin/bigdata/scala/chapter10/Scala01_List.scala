package com.rickyin.bigdata.scala.chapter10

/**
 * TODO 集合
 *   Java中的集合主要分三大类: List、Set、Map
 *        List: 有序,可重复
 *          LinkedList,ArrayList
 *        Set:  无序,不可重复
 *          HashSet,TreeSet
 *        Map:  无序,(K-V) key不可重复,value可以重复
 *          HashMap,HashTable,TreeMap
 *   Scala中的集合主要分两大类: 可变集合(mutable)、不可变集合(immutable)
 *        这里的不可变指的是内存地址、长度不可变,但是内容可以变化
 */
object Scala01_List {
  def main(args: Array[String]): Unit = {
    List(1,2,3,4)
  }
}