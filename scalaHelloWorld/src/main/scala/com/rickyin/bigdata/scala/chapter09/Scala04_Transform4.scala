package com.rickyin.bigdata.scala.chapter09

/**
 * todo https://www.cnblogs.com/xubiao/p/8000376.html 这里有个例子很简单
 * TODO 隐式类
 *    1.Scala2.10后提供了隐式类,使用 implicit 声明类,隐式类功能强大,同样可以扩展类的功能,比前面使用的隐式转换丰富类库功能更加方便,隐式类的特点
 *      (1).其所带的构造参数有且只能有一个 如: implicit class Person4(u: User4)
 *      (2).隐式类必须被定义在 "类" 或 "伴生对象" 或 "包对象" 里面(注意: 是里面),即隐式类不能是顶级的(top-level objects)
 *      (3).隐式类不能是 case class(case class在后续介绍 样例类)
 *      (4).作用域不能有与之相同名称的标识符
 */
object Scala04_Transform4 {
  def main(args: Array[String]): Unit = {
    /*
    implicit def transform(user4: User4):Person4 ={
      new Person4
    }
    */
    val user4 = new User4()
    user4.insert()
    user4.delete() //本来是无法调用,因为delete是在 Person4 类中,当然我们可以使用隐式转换函数,上面写了,还可以使用隐式类
  }

  //隐式类
  implicit class Person4(u: User4){
    def delete(): Unit ={

    }
  }
  class User4 extends Test {
    def insert(): Unit ={

    }
  }
}
trait Test{

}
object Test{

}
