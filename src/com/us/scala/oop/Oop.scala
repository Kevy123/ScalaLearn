package com.us.scala.oop

/**
  * Created by kevin on 16-10-11.
  */

class Person(name: String, age: Int) {

  private var gender: String = _
  println("默认执行")

  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }

  def info(): Unit = {
    println(this.age)
    println(this.name)
    println(this.gender)
  }
}
//私有构造方法
class Person1 private (name: String, age: Int) {

  private var gender: String = _
  println("默认执行")

  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }

  def info(): Unit = {
    println(this.age)
    println(this.name)
    println(this.gender)
  }
}

//class Student(){
class Student {

  var name: String = _
  private var age = 1
  private[this] var gender = "male"

  def this(age: Int) {
    this //必须添加默认构造
    this.age = age
  }

  //  def compare(s : Student): Unit ={
  //      s.gender //private[this] , gender只能在本类中使用
  //  }

  def info() {
    println(this.name + ":" + this.age + ":" + this.gender)
  }

}

class User {
  var name = "user"
  private var age = 0

  def increAge() {
    age += 1
  }

  def getAge() = {
    age
  }

  def compareAge(u: User) = {
    age > u.getAge()
  }

}

class Outer {
  var name : String = _
  class Inter{
    var name :String = _

    def execOut(out : Outer): Unit ={
      println(this.name +":"+out.name)
    }

  }


 class Inter2(name : String) {

   def execIn(in : Inter2 ){

      println(this.name +":"+in.name)
    }
  }
}


object Oop {

  def main(args: Array[String]): Unit = {
    /*
     * val u = new User
       val u1 = new User
       u.increAge()
       println(u.name)
       println(u.getAge())
       println(u1.compareAge(u))
     */

    /*
    val s = new Student(555)
    val s1 = new Student()
    s.info()
    s1.info()
    */
/*
//    val p = new Person("a", 1)
//    p.info()
      val p = new Person("a", 1,"c")
      p.info()

      val p1 = new Person1("a",1,"ads")//私有构造方法
      p1.info()
  */
    val o = new Outer
    val oo = new Outer
    o.name = "O1"
    oo.name = "O2"
    val i = new o.Inter
    i.name = "I1"
    i.execOut(o)
    i.execOut(oo)

    val ii = new oo.Inter2("a")
    ii.execIn(ii)

  }

}
