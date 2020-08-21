package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO
 *    1.前面当一个源码文件中出现了伴生对象和类的时候，源码文件的图标就会变为红色的那个比如: Scala07_Method1
 *    2.现在我们的图标变为了上面蓝色,下面黄色,这是为什么呢? 只有我们的伴生对象和伴生类同名的时候才会变成这样
 *    3.根据之前我们学习的伴生对象中的属性我们可以直接访问(只要你不加private),就像是Java中的 public static修饰的属性一样,所以伴生对象我们可以
 *      理解为存放静态属性的地方,而伴生类就是存放成员变量和普通方法的地方
 *    4.我们利用反编译工具将下面代码编译成Java代码,虽然在Scala中分成了两个东西,但在Java代码中却是在一个 Student 类中,伴生对象声明的都会加上static
 *      修饰
 *    5.所以伴生对象可以访问伴生类的私有属性,你想啊,他们转换成Java代码后都在一个类中肯定可以啊
 *    6.伴生对象的另外一个作用是创建伴生类对象,不过需要提供特殊的方法( apply ),实现相应的功能
 *    7.Scala自动识别apply方法,用于创建伴生类对象
 */

/**
 * todo 总结
 *  生成的两个文件： 有$符号的我们叫伴生对象文件,没有的我们叫伴生类文件
 *  Scala编译后的Java文件中的get和set方法的书写格式: 属性名: name  Get方法：name() Set方法 name_$eq(xxx)
 *  伴生类中成员属性:
 *    1.如果是私有的,且是 val 修饰(相当于 private final),那么伴生类文件中就只会生成该属性的非静态 get 方法
 *    2.如果是 var 修饰且没有 private修饰,那么在伴生类文件中就会生成其非静态的 Get 和 Set 方法
 *  伴生类中方法:
 *    就像是普通的Java文件中的方法一样,如果是 private 修饰,那么方法权限就是 private
 *  伴生对象的成员属性:
 *    1.如果没有 private 修饰,那么就会在 "伴生对象文件" 中生成非静态的 Get 和 Set 方法同时在 "伴生类文件中" 生成静态的 Get 和 Set 方法
 *    2.如果有 private 修饰,那么就会在 "伴生对象文件" 中生成非静态的私有的 Get 和 Set 方法 不会在 "伴生类文件中" 生成静态的 Get 和 Set 方法
 *  伴生对象的方法:
 *    1.如果当前方法没有 private 修饰,那么就会在 "伴生对象文件" 中生成非静态的当前方法,同时在 "伴生类文件中" 生成静态的当前方法
 *    2.如果加了 private 修饰,就只会在 "伴生对象文件" 中生成非静态的私有的当前方法,不会在 "伴生类文件中"生成什么
 *
 */

//伴生类(成员)
class Student {
  private val sname = "rick"
  var pass = "123"
  def rick():Unit = {

  }
}
//伴生对象(静态)
//伴生对象可以访问伴生类的私有属性
//创建伴生类对象
object Student {
  private var ss = "asd"
  def main(args: Array[String]): Unit = {
    new Student().sname // 伴生对象可以访问伴生类的私有属性(静态不能直接访问成员属性,需要 new Student())
  }
  def apply(s:String): Student = new Student()
  def test(): Unit ={
  }
}

