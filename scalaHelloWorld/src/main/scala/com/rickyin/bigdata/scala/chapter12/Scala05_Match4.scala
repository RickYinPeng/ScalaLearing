package com.rickyin.bigdata.scala.chapter12

/**
 * TODO 特殊的模式匹配
 * 变量声明中的模式: match 中每一个 case 都可以单独提取出来,意思是一样的
 */
object Scala05_Match4 {
  def main(args: Array[String]): Unit = {
    /**
     * todo
     *  之前元组声明:
     *    val t = (1,2,3,4,5,6,7,8,9)
     *    println(t._1+"="+t._2+"="+t._3+"="+t._4) //取值
     *    这样有一个弊端就是不好取值，如果元组中的数据更多的话
     *  可以这样声明:其实这是一种特殊的模式匹配
     *    val (x, y) = (1, 2)
     *    println(x + "=" + y)
     */
    //特殊的模式匹配
    val (x, y) = (1, 2)
    println(x + "=" + y)

    val (username, age, email) = ("rick", 18, "272940172@qq.com")
    println(username + "\\" + age + "\\" + email)

    val (q, r) = BigInt(10) /% 3; //包含两个连续的运算符
    println("q= " + q) //结果拿到
    println("r= " + r) //余数拿到

    /**
     * TODO for循环中的模式匹配
     */
    val list: List[(String, Int)] = List(("a", 1), ("b", 2), ("c", 3))
    for (elem <- list) {
      println(elem._1 + "=" + elem._2)
    }
    for ((k, v) <- list) {
      println(k + "=" + v)
    }


  }
}
