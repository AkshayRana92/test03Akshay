package com.knoldus.test03.firstfuture

import scala.concurrent.{Promise, Future}

import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by akshay on 15/2/16.
  */
object FirstFuture {

  def getFirst(list:List[Int]):Future[Int]={
    val futureList:List[Future[Int]] = listToFactList(list)
    val promise=Promise[Int]
    futureList.foreach(_.onComplete{ case x => promise.tryComplete(x)})
    promise.future

  }

  def listToFactList(list:List[Int]):List[Future[Int]] ={
    val futureList:List[Future[Int]] = list map{
      x => (futFact(x))
    }
    futureList
  }

  def futFact(a:Int):Future[Int] = Future{

    def fact(a: Int): Int = a match {
      case 0 => 1
      case _ => a * fact(a - 1)
    }
    fact(a)
  }

}
