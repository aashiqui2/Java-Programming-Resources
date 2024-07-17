# Exception Handling:

1) What is Exception?
Abnormal Behaviour in programs

Abnormal event which stops the program abruptly.
```java
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=a/b;
System.out.println(c);
```


100% Object Oriented Programming?

Primitive DataTypes:int float

JVM-->Object-->Class

# Exception-->whenever Exception  occurs,the corresponding exception Object will be thrown.
(`Example:` people protest less people can be arresetd but huge in people cannot be arrested or removed from protest.)


# Stack: 
add()
divide() -divide /by zero
main()

Throwable-->Object

Exception Object -->Throwable

Throwable-->Error,Exception


java.lang.Object
java.lang.Throwable
Direct known subclass: Error and Exception

# Throwable class
Throwable class is the superclass of all error and exception in the java language.
only objects that are instances of this class (or one of its subclass)are thrown by the java Virtual Machine.


# Exception
checked exception--->Compile time Exception 
unchecked exception--Runtime Exception


A throwable contains a snapshot of the execution stack of its thread at the time it was Created.It can also contain a message string that gives more information about the error.

1) Stack-Line No
2) Exception Name
3) Message String


```java
public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Arithmetic ar=new Arithmetic();
		ar.divide(a,b);
	}
	public void divide(int a,int b){
		int result=a/b;
		System.out.println(result);
		add(a,b);
	}
	public static void add(int a,int b){
		int result=a+b;
		System.out.println(result);
	}
}
```
# Output
----------------------------------------------------------------
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Arithmetic.divide(Arithmetic.java:12)
        at Arithmetic.main(Arithmetic.java:9)
-----------------------------------------------------------------

# Error:
An error is a subclass of Throwable that indicates serious problem that a reasonable application should not try to catch.Most such errors are abnormal conditions.

# Exception:
The class Exception and its subclass are a form of throwable that indicates conditions that a reasonable application might want to catch.

# Example
coupen 500 for perchasing tv but the coupen validity date is expired so coupen is return back to the customer.

* `so, whenever exception occur the corresponding exception object will be thrown.`
* `It should be catch.`

```java
try{
        1.fride
        2.bill
        3.Coupon -Handover
}
catch(CouponException ce)
{
  System.out.println("ok,sir");
  try{
        1.call owner and argue
  }
  catch(DIDNOTPICKUPCALLException)
  {

  }
}
```
# Syntax
-------------------
try{
    //actual code
}
catch(Couponcode e){
    //handling code
}
----------------------

# Runtime Exception
Runtime exeception is the superclass of those exeception that can be thrown during the normal operation of the JVM.
`RuntimeException and its subclass are unchecked exception.`
`unchecked exception are known at runtime.`
`All runtime exception are RuntimeException.`

RuntimeException-->superclass

ArithmeticException-->subclass

# StackOverflow error:(Runtime Exception)
StackOverflowError is an error which Java doesn’t allow to catch, for instance, stack running out of space, as it’s one of the most common runtime errors one can encounter.


# checked Exception Example
Scanner filelocation=sc.next();
1) User -->location (location wrong)
2) FileReading
3) Print

```java
try{
    Stringfilelocatopn=sc.next();
}
catch(FileNotFoundException fnf)
{ 
    
}
```

1) what is Exception?
2) Base Class -Throwable
3) Exception
   -Stack -snapshot
   -String message
# Stack Trace(print)
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Arithmetic.divide(Arithmetic.java:12)
        at Arithmetic.main(Arithmetic.java:9)
4) try
5) catch(Exception object)

# InputMismatchException
```java
public class InputMismatch {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(n);
  }
}
```
-----------------------------------------------------------------------
Exception in thread "main" java.util.InputMismatchException      
        at java.base/java.util.Scanner.throwFor(Scanner.java:947)
        at java.base/java.util.Scanner.next(Scanner.java:1602)   
        at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
        at ExceptionDemo.main(ExceptionDemo.java:12)
-----------------------------------------------------------------------------
```java
try{
bike.start();
}
catch(BikeNotStartedException)
{
 
}
start()
try{
ontheway-issues
}
catch(BikeStoppedException bse)
{
//
}
```
```java
try{
bike.start();
}
catch(StartingTrouble st)
{
 
}
catch(Punture p)
{

}
catch(NoPetrol np)
{

}
catch(Friend f)
{

}
```

# Finally
```java
try
{
//
}
catch(Exception object)
{

}
finally
{

}
```


`try-catch block/finally block/catch block and finally block`
try block should be accompained by catch or fianlly or both.
```java
try
{

}
finally
{

}
```

```java
import java.util.Scanner;
public class Arithmetic {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
try 
{
int c=a/b;
System.out.println(c);
}
finally 
{
System.out.println("Program Ends");
}
}
}
```
-------------------------------------------------------------------
Program Ends
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Arithmetic.main(Arithmetic.java:12)
-------------------------------------------------------------------

* finaly block will be called always irrespective of Exception occurs or not. 

* finally block will come after catch block.

* for one try block there should be one finally block.

* catch block will be called only when corresponding Exception Object is Thrown.

```java
try
{
1.Database
2.username
3.password
4.file opened- Exception(other user cannot open at a same time)
5.processed
6.file close
}
catch()
{
 
}
finally
{
1.file close
}
```

try catch finally throw throws?

user defined Exception?

# throws:

```java
class TakeMyBikeDemo
{
public static void main(String[] args) throws NoPetrolException,GearProblemException
{
  //riding others bike
}
} 
```

```java
class Friend
{
public static void main(String[] args)
{
TakeMyBikeDemo friend=new TakeMyBikeDemo();
try
{
friend.rideOtherBike();
}
catch(NopetrolException npe|| GearProblemException gpe)
{

}
}
}
```
throws keyword-methods signature
throw keyword-method body

 