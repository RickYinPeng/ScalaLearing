package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO 类信息
 *    1.Java中我们可以用一个类的实例调用 getClass() 方法或者 类名.class 的方式获取Class信息,在Scala中怎么做呢?
 *    2.在Scala中我们使用 classOf[类名] 来获取类信息
 *    3.type: 这个关键字可以给类起别名
 *    4.isInstanceOf: 类似与Java中的 instanceof
 *    5.asInstanceOf: 相当于强制类型转换
 */
object Scala19_ClassInfo {
  def main(args: Array[String]): Unit = {
    // User19.class
    // object.getClass
    // Class
    //TODO Scala如果想要获取类的信息,需要采用特殊的方法: classOf[类名]
    // classOf能直接使用,因为 scala.Predef 伴生对象是默认导入到当前开发环境中的,所以不需要导类
    val userClass = classOf[User19]
    userClass.getInterfaces

    /**
     * type: 这个关键字可以给类起别名
     */
    type XXX = User19 // 相当于将 User19 命名为 XXX 我们直接 new XXX() 就可以构造 User19 的对象了
    val xxx = new XXX()

    val user:Object = new User19()
    val bool: Boolean = user.isInstanceOf[XXX]
    printf(bool.toString)
    if(bool){
      val user1 = user.asInstanceOf[XXX]
    }
  }
}

class User19 {

}