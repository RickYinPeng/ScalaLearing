package com.rickyin.bigdata.scala.chapter10

object Scala09_WordCount {
  def main(args: Array[String]): Unit = {
    val lineLists: List[(String, Int)] = List(("Hello Scala World", 4), ("Hello World", 3), ("Hello Hadoop", 2), ("Hello Hbase", 1))

    //将一行数组拆分成一个一个的数据
    //("Hello Scala World", 4) => ("Hello",4) ("Scala",4) ("World",4)
    val flatMapList: List[(String, Int)] = lineLists.flatMap(t => {
      var line: String = t._1
      var num: Int = t._2
      val words: Array[String] = line.split(" ")
      words.map(w => (w, num))
    })
    println(flatMapList.mkString(","))

    //将单词分组
    val groupWordMap: Map[String, List[(String, Int)]] = flatMapList.groupBy(t => t._1)
    println(groupWordMap.mkString(","))

    //List((Hello,4), (Hello,3), (Hello,2), (Hello,1))
    // ==> list(4,3,2,1)
    // ==> list.sum
    //将单词出现次数汇总
    val wordToSumMap: Map[String, Int] = groupWordMap.map(t => {
      val countList: List[Int] = t._2.map(tt => tt._2)
      (t._1, countList.sum)
    })
    //另外一种写法
    val wordToSumMap2: Map[String, List[Int]] = groupWordMap.mapValues(datas => {
      datas.map(t => t._2)
    })
    println(wordToSumMap)

    //将统计的结果降序排列
    val sortList: List[(String, Int)] = wordToSumMap.toList.sortWith((left, right) => left._2 > right._2)
    val sortList2: List[(String, Int)] = wordToSumMap.toList.sortWith(_._2 > _._2) //简写
    println("sortList: "+sortList)
    println("sortList2: "+sortList2)


    //从排序后的集合中获取前3跳
    val resultList: List[(String, Int)] = sortList.take(3)
    println(resultList) //打印: List((Hello,10), (World,7), (Scala,4))
  }
}
