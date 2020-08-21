package com.rickyin.bigdata.scala.chapter14

object Scala01_Class {
  def main(args: Array[String]): Unit = {
    test[User](new User);
    test(new Child)
    //test(new Person) todo 报错 Person是User的子类
  }

  /**
   * todo
   *  [T <: User] 等同于Java中 <? extends User> : User或User的子类
   */
  def test[T <: User](t:T): Unit ={
    println(t)
  }

  /**
   * todo
   *  [T >: User] 和Java不一样,这里表示什么类型都可以传递
   */
  def test1[T >: User](t:T): Unit ={
    println(t)
  }

}
class Person{
}
class User extends Person{
}
class Child extends User{
}