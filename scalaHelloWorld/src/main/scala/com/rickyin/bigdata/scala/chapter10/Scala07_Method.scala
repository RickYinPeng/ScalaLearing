package com.rickyin.bigdata.scala.chapter10

/**
 * TODO 集合常用方法
 */
object Scala07_Method {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 1, 3)
    val strlist: List[String] = List("11","22","14","23")

    /**
     * TODO List常用方法
     *    1.list.map()
     *    2.list.iterator
     *    3.list.groupBy()
     *    4.list.sortBy()
     *    5.list.sortWith()
     *    6.list.fold() 有点难度
     *    7.list.sum: 求和
     *    8.list.product: 乘积
     *    9.list.reverse
     *    10.list.reduce()
     *    11.list.max: 最大值
     *    12.list.min: 最小值
     */

    println("---------------------List求和(sum)")
    //求和
    println("sum=" + list.sum)

    println("---------------------List最大值(max)最小值(min)")
    println("max=" + list.max)
    println("min=" + list.min)

    println("---------------------List.produce: 乘积")
    println(list.product)

    println("---------------------List.reverse: 反转,无排序")
    println(list.mkString(","))
    println("reverse=" + list.reverse)

    println("---------------------List.groupBy(): 分组")
    //分组: 通过指定函数的返回值进行分组
    val map: Map[Int, List[Int]] = list.groupBy(x => x)
    map.foreach(t => {println(t._1 + "=" + t._2)})

    println("---------------------List.groupBy(): 通过首字母分组")
    //通过首字母分组
    val stringToStrings: Map[String, List[String]] = strlist.groupBy(s => s.substring(0, 1))
    stringToStrings.foreach(t => {println(t._1 + "=" + t._2)})

    println("---------------------List.groupBy(): 奇数偶数分组")
    val map1: Map[Int, List[Int]] = list.groupBy(i => i % 2)
    map1.foreach(t=>println(t._1+"="+t._2))

    println("---------------------List.sortBy(): 按照指定规则排序,从小到大")
    val sortList: List[Int] = list.sortBy(x => x)
    println(sortList.mkString(","))

    println("---------------------List.sortBy(): 根据字符串的第二个字符排序")
    val sortStringList: List[String] = strlist.sortBy(x => x.substring(1))
    println(sortStringList.mkString(","))

    println("---------------------List.sortWith(): 升序和降序")
    val list1: List[Int] = list.sortWith((x, y) => x < y)
    println(list1.mkString(",")) //打印: 1,1,2,3,3,4

    val list2: List[Int] = list.sortWith((x, y) => x > y)
    println(list2.mkString(",")) //打印: 4,3,3,2,1,1

    println("---------------------List.sortWith(): 根据字符串的第二个字符降序排序")
    val strlist2: List[String] = List("11","35","14","26")
    val strings: List[String] = strlist2.sortWith((left, right) => {
      left.substring(1) > right.substring(1)
    })
    println(strings.mkString(",")) //打印: 26,35,14,11

    println("---------------------List.iterator")
    for (elem <- list.iterator) {
      println(elem)
    }

    println("---------------------List.take(): 获取集合前多少个,我们排完序需要取前多少个")
    list.take(10)//取前10

    println("---------------------List.map(): 映射(转换),将集合的每一种元素转换为另外一种结构(MR的演示)")
    //TODO 将集合中每一个元素映射成元组 如: x=>(x,x)
    val M: List[(Int, Int)] = list.map(x => (x, 1))
    println(M.mkString(",")) // 打印: (1,1),(2,1),(3,3),(4,1),(1,1),(3,1)

    val M1: Map[Int, List[(Int, Int)]] = M.groupBy(t => t._1)
    println(M1.mkString(","))

    val R: Map[Int, Int] = M1.map(t => (t._1, t._2.size))
    println(R.mkString(","))

    println("---------------------WordCount案例")
    //TODO WordCount案例(MapReduce)
    //对集合中的单词字符串统计出现的次数,并且按照出现的次数降序排列,并且取前3名
    val wordList: List[String] = List("Hello", "Scala", "Hello", "World", "Hbase", "Kafka", "Scala", "World")
    println(wordList)
    //1.将相同的单词放置在一起(分组) ("Hello",List("Hello","Hello"))
    val wordToList: Map[String, List[String]] = wordList.groupBy(word => word)
    println(wordToList)
    //2.将数据结构进行转换 ("Hello",list.size)
    val wordToCount: Map[String, Int] = wordToList.map(t => (t._1, t._2.size))
    println(wordToCount)
    //3.将数据进行排序(降序)
    val wordToCountList: List[(String, Int)] = wordToCount.toList
    println(wordToCountList)
    val wordSortList: List[(String, Int)] = wordToCountList.sortWith((left, right) => {
      left._2 > right._2
    })
    println(wordSortList)
    //4.取排序完成后的前3条数据
    val resultList: List[(String, Int)] = wordSortList.take(3)
    println(resultList.mkString(","))

    println("---------------------lineList.flatMap:扁平化")
    /**
     * TODO
     *    1.在实际的WordCount中，我们读取内容是从文件中读取,是一行一行的,比如下面这个List,一个元素代表一行,所以我们不能直接将这个List向上面那
     *      样处理因为上面是已经将每个单词切分好了,这里没有,我是不是先需要将每个元素中的各个单词切分开来
     */
    //TODO 扁平化: 将一个整体中的内容拆成一个一个的单词 如: list => 1,2,3,4
    val lineList = List("Hello World","Hello Scala","Hello Hadoop")
    val flatMapList: List[String] = lineList.flatMap(x => x.split(" "))
    println(lineList) //打印: List(Hello World, Hello Scala, Hello Hadoop)
    println(flatMapList)//打印: List(Hello, World, Hello, Scala, Hello, Hadoop)
    val result1: List[(String, Int)] =
      flatMapList.groupBy(word => word).
        map(t => (t._1, t._2.size)).
        toList.
        sortWith((left, right) => left._2 > right._2)
    println(result1.mkString(","))
  }
}
