# Interface:
 set of rules or contract
 In Java, an interface is a reference type that defines a set of abstract methods along with some optional constants (static final fields). An interface can also include default methods, static methods, and nested types.

`Class:Template`

# Interface:
* By default methods in the interface are abstract.
* By Default all methods in the interface are public.
* Do not reduce visibility of the methods.
* private access modifier is not alowed in interface  
* variable(fields or global variable) in the interface are by  default final and static.

`global variable/fields/variable-->private, protected modifier not allowed.`


# What is Abstract class?

abstract methods

[Interface]                              [Abstract_Class]
* All methods are abstract              one method can be abstract
* All variable are final and static       No,not compulsory
* uses Implements keyword                uses extends keyword
* Constructor is not possible            Constructor is possible.

Interface =100% Abstract class or not?
No

can we create object for abstract class?
NO

can we create constructor for abstract class?
yes

can we create object for Interface?
No

can we create Constructor for interface?
No

# What is constructor?
Intializing object specific variables.(non-static variable)

# What is Interface?
Interface is a set of rules or contract.In java we can create Interface by using interface keyword .once interface is created, we can have variablesand methods inside an interface. All variables are final and statcic in an interface. All methods are  by default abstract. we don't need to give abstract keyword in method signature in interface .interface are implemented using  'Implements' keyword. A java class can implemented any number of Interface.if we implement interface in a class, we should give definition for all methods.


# Dynamic Binding:

Parent ref=new Child();

Interface in =new Implementing_class();

# Example
1) softwareEngineer extends parents implements trafficrules,officeRules
2) FullStackDeveloper extends Employee implements JavaDeveloper, PythonDeveloper