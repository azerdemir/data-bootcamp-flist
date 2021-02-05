package com.trendyol.bootcamp.scala.flist

trait FunList[A] {
  def head: A
  def tail: FunList[A]
  def isEmpty: Boolean

  def prepend(elem: A): FunList[A] = new FunCons[A](elem, this)

  def append(elem: A): FunList[A] = this match {
    case FunNil        => new FunCons[A](elem, this)
    case FunCons(h, t) => new FunCons[A](h, t.append(elem))
  }
}

case object FunNil extends FunList[Nothing] {
  override def head: Nothing          = throw new Exception("head does not exist for FunNil")
  override def tail: FunList[Nothing] = throw new Exception("tail does not exist for FunNil")
  override def isEmpty: Boolean       = true
}

case class FunCons[A](h: A, t: FunList[A]) extends FunList[A] {
  override def head: A          = h
  override def tail: FunList[A] = t
  override def isEmpty: Boolean = false

}

object FunList extends App {
  val fl1 = FunNil
  val fl2 = FunCons(1, FunNil)

  //val fl3 = fl1.prepend(3)
  val fl4 = fl2.prepend(5)

  //println(fl3)
  println(fl4)

  println(fl4.append(8))
}
