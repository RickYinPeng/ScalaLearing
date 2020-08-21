package com.rickyin.bigdata.scala.chapter060708

import scala.beans.BeanProperty

/**
 * TODO Scala中类的属性
 *      1.Scala中给类声明属性,默认为私有的(转化后的java代码是private),但是底层提供了公共的setter和getter方法,所以我们可以直接访问,
 *        如: user.username
 *      2.user.username 就相当于调用了底层的getter()方法 , user.username = "rickyin" 就相当于调用了底层的setter()方法
 *      3.如果在Scala中给属性显示的增加 private 修饰,那么属性无法在外部访问,因为底层生成的 setter和getter方法都是私有的
 *      4.如果声明的属性使用 val,那么属性是私有的,并且使用 final 修饰,底层只提供 getter 方法
 *      5.为了和Java Bean规范统一,Scala提供了注解,生成Java中对应的get和Set方法,虽然Scala编译成Java代码后也有set和get方法,但是我们在Scala
 *        中不能直接使用,所以可以使用注解: @BeanProperty ,这样我们就可以在Scala中调用get和set方法了
 */
object Scala06_Field {
  def main(args: Array[String]): Unit = {
    val user = new User06
    println(user.username) // 打印 null
    user.username = "rickyin"
    //user.age 报错: 因为age是private修饰的
    //user.email="272940172@qq.com" 报错: 因为email是val修饰的,无法改变
  }
}

/**
 * TODO Scala中也有四种访问权限
 *      1.public: 是默认的访问权限(不用写,因为没有这个关键字)
 *      2.protected: 访问权限只能子类访问,同包访问不了
 *      3.default(package): 包访问权限需要采用特殊的语法规则: 使用 private[包名]
 *      4.private: 私有访问权限,只能当前类访问
 */
package p1{
  package p2{
    class Userp2{
      var username = "rick"
      private var password = "123456"
      protected var email = "xxx@qq.com"
      private[p2] var address = "xxxxx"
    }
  }
  package p3{
    import com.rickyin.bigdata.scala.chapter060708.p1.p2.Userp2
    class Emp3{
      def test():Unit = {
        val user = new Userp2
        user.username
      }
    }
  }
}


class User06 {
  //声明属性
  var username: String = _ //_ 是默认初始化的意思

  private var age: Int = _

  val email: String = ""

  @BeanProperty var address :String = _
}
