package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO 特质(强调的顺序:class MySql extends File with DB) 从左到右,从右到左
 *    1.多特质混入时,代码执行顺序为从左到右,如果有父特质,先走父特质
 *    2.多特质混入时,方法调用顺序为从右到左
 *    3.特质中的 super 关键字不是指代父特质,指代的是上一级的特质(class MySql extends File with DB) 如: DB的上一级特质就是 File,File的
 *      上一级特质就是File的父特质
 *    4.如果希望 super 指向父特质,需要增加特殊操作: super[Operate].insert()
 *    5.Java的接口可以在Scala中当成特质来用 with Serializable(Serializable是Java中的接口)
 */
object Scala16_Interface3 {
  def main(args: Array[String]): Unit = {
    val mySql = new MySql()
    mySql.insert()
  }
}

trait Operate {
  println("Operate......")
  def insert(): Unit = {
    println("插入数据")
  }
}

//特质可以继承其他的特质
//特质重写父特质的方法,需要加上 override 关键字
trait DB extends Operate {
  println("DB......")
  override def insert(): Unit = {
    println("向数据库插入数据")
    super.insert() // 相当于调用父特质的方法insert
  }
}

trait File extends Operate{
  println("File......")
  override def insert(): Unit = {
    println("向文件插入数据")
    super[Operate].insert() // 相当于调用父特质的方法insert
  }
}

//多特质混入时,代码执行顺序为从左到右,如果有父特质,先走父特质
//多特质混入时,方法调用顺序为从右到左
//特质中的 super 关键字不是指代父特质,指代的是上一级的特质(class MySql extends File with DB) 如: DB的上一级特质就是 File,File的上一级特质就是File的父特质
//如果希望 super 指向父特质,需要增加特殊操作: super[Operate].insert()
class MySql extends File with DB with Serializable {

}

