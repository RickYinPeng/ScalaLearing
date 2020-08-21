package com.rickyin.bigdata.scala.chapter13

/**
 * TODO 偏函数(partial function)
 *    1.对符合某个条件,而不是所有情况进行逻辑操作时,使用偏函数是一个不错的选择
 *    2.将包在大括号内的一组case语句封装成函数,我们称之为偏函数,它只会作用与指定类型的参数或指定范围值的参数实施计算,超出范围的值会忽略
 *    3.偏函数在Scala中是一个特质 PartialFunction
 *    4.构建偏函数时,参数形式 [Any,Int] 是泛型,第一个表示传入的参数类型,第二个表示返回参数
 *    5.当使用偏函数时,会遍历集合的所有元素,编译器执行流程时先执行 isDefinedAt() 如果为 true,就会执行 apply,构建一个新的 Int 对象返回
 *    6.执行 isDefinedAt() 为 false 就过滤掉这个元素,即不构建新的 Int 对象
 *    7.map函数不支持偏函数,因为 map 底层的机制就是所有循环遍历,无法过滤处理原来集合的元素
 *    8.collect 函数支持偏函数
 *    9.声明偏函数,需要重写特质中的方法,有时候会略显麻烦,而Scala其实提供了简单的方法
 *    10.case语句可以自动转换为偏函数
 *
 */
object Scala01_Function {
  def main(args: Array[String]): Unit = {

    /**
     *  给你一个集合 val list = List(1,2,3,4,"abc"),请完成如下要求:
     *    1.将集合list中的所有数字 +1 ,并返回一个新的集合
     *    2.要求忽略掉非数字的元素,即返回的新的集合形式为(2,3,4,5)
     */
    val list = List(1,2,3,4,"abc")

    val list1: List[AnyVal] = list.map(x => {
      if (x.isInstanceOf[Int]) {
        x.asInstanceOf[Int] + 1
      }
    })
    println(list1) //打印: List(2, 3, 4, 5, ()),虽然忽略了字符串,但是不满足条件,我们可以使用filter函数过滤,如果是Int类型就留下这个数据
    val list2: List[AnyVal] = list1.filter(x => x.isInstanceOf[Int])
    println(list2) //打印: List(2, 3, 4, 5)

    println("--------------第二种方法")
    //第二种方法
    def f1(n:Any):Boolean = {
      n.isInstanceOf[Int]
    }
    def f2(n:Int):Int = {
      n+1
    }
    def f3(n:Any):Int = {
      n.asInstanceOf[Int]
    }

    /**
     * todo 这行代码与上面的相比有什么不同呢?
     *  1.上面我们只用了一个 map 这里为什么会用了两次? 按理来说我们过滤完就直接 +1 就行了啊,为什么还要用一次map呢?
     *   解析: list的类型是 List[Any] ,因为List里面有数字也有字符串,所以是Any,f1函数的参数类型是Any,所以使用 list.filter(f1) 调用就不会
     *        出错,filter函数的入参是一个函数,这个函数的参数需要与调用 filter函数的集合中的元素类型一致,倘若 f1 函数的参数类型是 Int 那么
     *        list.filter(f1)就会报错,不信你试试,所以 list.filter(f1)的返回值类型就是 List[Any]
     *        val list4: List[Any] = list.filter(f1)
     *        按理说现在我们过滤完了直接 +1 就行了,直接调用 list4.map(f2)就行了,但是当我们调用的时候会报错,前面我们说了filter函数的入参是一
     *        个函数,这个函数的参数需要与调用 filter函数的集合中的元素类型一致,map函数也一样,现在 list4 的类型是 List[Any] 而 函数 f2的参
     *        数类型是 Int 所以直接调用会报错,所以先调用 map(f3),将集合中的元素类型都转换为 Int 再去调用就不会出错了
     *        而在上面我们是做了一个判断 if (x.isInstanceOf[Int]) 对是 Int 类型的做操作,不是 Int 类型的不做操作,这种对一部分数据做操作一部
     *        分不做操作的就是一种偏的概念,它不是对全部数据做操作,Scala中提供了对于偏函数的特殊定义方式
     *
     */
    val list4: List[Any] = list.filter(f1)
    val list3: List[Int] = list4.map(f3).map(f2)
    println(list3)

    println("--------------偏函数")
    /**
     * todo 偏函数
     *    1.可以看书重写了两个方法 isDefinedAt 和 apply,首先会进入 isDefinedAt 方法,如果返回 true就去执行 apply方法,如果返回false就去过滤
     *       isDefinedAt方法其实就相当于 filter 方法
     */
    val addOne = new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any): Boolean = {
        if(x.isInstanceOf[Int]) true
        else false
      }
      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] +1
      }
    }
    /**
     * TODO
     *    collect: 收集方法,支持偏函数,将满足条件的收集起来
     *    map方法不能执行偏函数操作,因为它必须对所有数据进行转换,不能只对其中一部分数据进行操作
     */
    //collect: 收集方法,支持偏函数,将满足条件的收集起来
    val list5: List[Int] = list.collect(addOne)
    //map方法不能执行偏函数操作,因为它必须对所有数据进行转换,不能只对其中一部分数据进行操作
    //val list6: List[Int] = list.map(addOne)
    println(list5)

    println("--------------偏函数简化形式一")
    /**
     * TODO 声明偏函数,需要重写特质中的方法,有时候会略显麻烦,而Scala其实提供了简单的方法
     */
    def f4: PartialFunction[Any,Int] = {
      case i:Int => i+1 //TODO case语句可以自动转换为偏函数
    }
    val list6: List[Int] = list.collect(f4)
    println(list6)

    println("--------------偏函数简化形式二")
    val list7: List[Int] = list.collect({ case i: Int => i + 1 })
    println(list7)
  }
}
