/*

package com.knoldus.test03.operations

/**
  * Created by akshay on 15/2/16.
  */


object Expression {

  def calc(expr:String): Int ={
    val list = expr.toList
    //newList = splitCharList(list)
    val res = calcRecursion(list)
  }

 /* def splitCharList(list:List[Char]):List[String] = {

  }*/


  def calcRecursion(list:List[Char]):List[Char] =list match{
    case head::tail => calcRecursion(operate(list))
  }

  def operate(list:List[Char]):List[Char] =list.tail.head match{
    case '*' =>
  }

}
*/