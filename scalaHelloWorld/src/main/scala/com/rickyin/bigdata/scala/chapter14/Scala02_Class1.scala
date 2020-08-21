package com.rickyin.bigdata.scala.chapter14

object Scala02_Class1 {
  def main(args: Array[String]): Unit = {
    //List<User1> list = new ArrayList<User1>();
    val test:Test[User1] = new Test[User1]
    //val test:Test[User1] = new Test[Child1] todo 报错，泛型的不可变性
    println(test)

    /**
     * TODO 在Scala中,为了丰富泛型的功能,提供了协变(+),逆变(-)的类型操作
     */
    val test1:Test[User1] = new Test[Child1]//协变,在定义类的时候写一个 + 号 如: class Test[+User1]

    val list: List[Int] = List(1, 2, 3, 4)
    //list.reduceLeft[User1]()


  }
}
class Person1{
}
class User1 extends Person1{
}
class Child1 extends User1{
}
class Test[+User1]{

}