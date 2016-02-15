package com.knoldus.test03.employee

import org.scalatest.FunSuite

/**
  * Created by akshay on 15/2/16.
  */
class EmployeeTest extends FunSuite{

  test("Non Empty list"){
    val list:List[Employee] = List(Employee(1,"akshay",200),Employee(2,"Ankit",500),Employee(3,"Ashish",400))
    val res = SortEmployees.sortEmp(list)
    assert(res === List(Employee(1,"akshay",200),Employee(3,"Ashish",400),Employee(2,"Ankit",500)))
  }

  test("Empty List"){
    val list:List[Employee] = List()
    val res = SortEmployees.sortEmp(list)
    assert(res === List())
  }

}
