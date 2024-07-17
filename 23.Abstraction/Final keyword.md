# This includes final classes, final variables, and final methods:

* A final class cannot be extended by any other class.
* A final variable cannot be reassigned another value.
* A final method cannot be overridden

# final:
* We cannot override Final methods.
* we cannot re-assign final methods.
* we cannot extends final class.

# check this
* private variable:same class Access,reassign
* final variable:can be accessed from other 
* classes,reassign not posssible anywhere.

private:

* If atleast one method is abstract the entire class is abstract.

* Parent2 is abstract; cannot be instantiated

instance-object

Inheritance:Child Object behaves as Parent Object

# Abstraction:
Showing only necessary and hiding unwanted data

why do we need Abstarction

abstarct: overriding:inheritance:encapsulation
abstract method cannot be private

method overriding is runtime polymorphism



# For Final keyword example

```java
final class Super {
   private int data = 30;
}
public class Sub extends Super{
   public static void main(String args[]){
   }
}


// You cannot extend a final class. If you try it gives you a compile time error.


// we cannot Override final method 
class A 
{
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
}

class B extends A 
{
    void m1()
    { 
        // Compile-error! We can not override
        System.out.println("Illegal!");
    }
}
