package com.trendyol.bootcamp.scala.flist

/*
trait FList[A] {
  def append(elem: A): FList[A]
  def prepend(elem: A): FList[A]
  def concat(that: FList[A]): FList[A]

  def contains(elem: A): Boolean

  def map[B](f: A => B): FList[B]
  def flatMap[B](f: A => FList[B]): FList[B]
  def filter(predicate: A => Boolean): FList[A]
  def foreach(f: A => Unit): Unit
}

class FNil[A] extends FList[A] {
  override def append(elem: A): FList[A] = new FCons[A](elem, this)

  override def prepend(elem: A): FList[A] = new FCons[A](elem, this)

  override def concat(that: FList[A]): FList[A] = that

  override def contains(elem: A): Boolean = false

  override def map[B](f: A => B): FList[B] = new FNil[B]

  override def flatMap[B](f: A => FList[B]): FList[B] = new FNil[B]

  override def filter(predicate: A => Boolean): FList[A] = this

  override def foreach(f: A => Unit): Unit = ()

  override def toString: String = ""
}

class FCons[A](head: A, tail: FList[A]) extends FList[A] {
  override def append(elem: A): FList[A] = new FCons[A](this.head, this.tail.append(elem))

  override def prepend(elem: A): FList[A] = new FCons[A](elem, this)

  override def concat(that: FList[A]): FList[A] = ???

  override def contains(elem: A): Boolean = ???

  override def map[B](f: A => B): FList[B] = ???

  override def flatMap[B](f: A => FList[B]): FList[B] = ???

  override def filter(predicate: A => Boolean): FList[A] = ???

  override def foreach(f: A => Unit): Unit = ???

  override def toString: String = s"$head, ${tail.toString}"
}

object FList {
  def main(args: Array[String]): Unit = {
    val fl = new FCons[Int](1, new FCons[Int](2, new FNil[Int]))

    val fl1 = fl.append(3)
    val fl2 = fl1.append(4)

    println(fl2)
  }
}
*/
