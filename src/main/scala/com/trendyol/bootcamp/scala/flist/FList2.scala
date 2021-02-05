package com.trendyol.bootcamp.scala.flist

/*
trait FList2[+A] {
  def head: A
  def tail: FList2[A]
  def isEmpty: Boolean

  def prepend[B ](item: A): FList2[A] = new FCons2[A](item, this)

  def append(item: A): FList2[A] = this match {
    case FNil2        => new FCons2[A](item, this)
    case FCons2(h, t) => new FCons2[A](h, t.append(item))
  }

  def concat(that: FList2[A]): FList2[A] = this match {
    case FNil2        => that
    case FCons2(h, t) => new FCons2[A](h, t.concat(that))
  }

  def map[B](f: A => B): FList2[B] = this match {
    case FNil2        => FNil2[B]
    case FCons2(h, t) => new FCons2[B](f(h), t.map(f))
  }

  def flatMap[B](f: A => FList2[B]): FList2[B] = this match {
    case FNil2        => FNil2[B]
    case FCons2(h, t) => f(h).concat(t.flatMap(f))
  }

  def filter(p: A => Boolean): FList2[A] = this match {
    case FNil2 => this
    case FCons2(h, t) =>
      val newTail = t.filter(p)
      if (p(h)) newTail.prepend(h)
      else newTail
  }
}

case object FNil2 extends FList2[Nothing] {
  override def head: Nothing         = throw new Exception("No head for FNil2")
  override def tail: FList2[Nothing] = throw new Exception("No tail for FNil2")
  override def isEmpty: Boolean      = true
}

case class FCons2[A](headItem: A, tailItems: FList2[A]) extends FList2[A] {
  override def head: A          = headItem
  override def tail: FList2[A]  = tailItems
  override def isEmpty: Boolean = false
}

object FList2 {
  def main(args: Array[String]): Unit = {}
}
*/
