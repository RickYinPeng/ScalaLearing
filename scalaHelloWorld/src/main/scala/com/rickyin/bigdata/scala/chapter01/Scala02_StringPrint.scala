package com.rickyin.bigdata.scala.chapter01

// 打印字符串
object Scala02_StringPrint {
  def main(args: Array[String]): Unit = {

    val name = "ApacheCN"
    val age = 1
    val url = "www.atrickyin.com"
    println("name=" + name + " age=" + age + " url=" + url)
    printf("name=%s,age=%d,url=%s \n", name,  age, url)

    //插值字符串
    print(s"name=${name},age=${age},url=${url} \n")
    print(f"name=${name},age=${age}%.2f,url=${url} \n")//f: 格式化，比如 ${age}%.2f
    println(raw"name=${name},age=${age}%.2f,url=${url} \n")//raw：显示原始值，"\n"不会被转义
  }
}
