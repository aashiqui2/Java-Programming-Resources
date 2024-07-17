# Inheritance :
A class that is derived from another class is called a `subclass`.
(also a derived class,extended class ,or child class)

* Transfering the Authority:

* child behaves as parent:

* child object behaves as parent object:

* when Constructor will get called?
  `when object is created.`

Branch_Office -->employee
Office -->employee:


* Child object can access all non-private , non-static methods and variable from parent class.

* If child class is present in other package than the parent class package,child class cannot access package-private variables and methods [non-static].


* Child class cannot access private non-static variable and methods present in parent class.

parent child -->majarity activities,properties

* when should i go for inheritance?
When there is a "IS-A" relationship between two classes, we go for inheritance


Office  
Branch_Office is an Office - True 
Employee is an Office      -False

animal
Tiger is an animal

How:
parent:super:base:
child:sub: Derived:Extended:


Types of Inheritance:
------------------------------
1) Single Inheritance:
Single parent -Single Inheritance

2) Hierachical Inheritance:
Parent -Child1,Child2

3) MultiLevel Inheritance:
Parent -child -Grandchild- great GrandChild

4) Combination of hybrid Inheritance:
combination of Multiple and hierachical inheritance

5) Multiple Inheritance
  java does  not support multiple inheritance.

# Extention from more than one parent:

Diamond problem:
father,mother
5tf,5ft
gov emp,gov emp

when we extend from more than one parent class. it becomes ambiguous[Confused] -which method is called from which parent.

son s/o father
daughter s/o parent
child extends parent


Interface:




