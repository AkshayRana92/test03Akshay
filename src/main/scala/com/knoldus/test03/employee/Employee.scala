package com.knoldus.test03.employee

/**
  * Created by akshay on 15/2/16.
  */

case class Employee(id:Int, name:String, salary:Int)

object OrderingEmployee extends Ordering[Employee]
{

  def compare(emp1:Employee, emp2:Employee):Int ={
    if (emp1.salary > emp2.salary)
      1
    else if(emp1.salary < emp2.salary)
      -1
    else
      0
  }

}


object SortEmployees {

  def sortEmp(list: List[Employee]): List[Employee] = list.sorted(OrderingEmployee)

}
