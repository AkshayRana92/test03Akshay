package com.knoldus.test03.firstfuture

import org.scalatest.FunSuite

import scala.concurrent.Await

import scala.concurrent.duration._

/**
  * Created by akshay on 15/2/16.
  */
class FirstFutureTest extends FunSuite{
  test("Non Empty list"){
    val list = List(1,2,3,4)
    val res = FirstFuture.getFirst(list)
    val result = Await.result(res, 5 seconds)
    assert(result === 1 ||result === 2 ||result === 6 ||result === 24 )
  }

}
