# Constructor
* constructor is useful for  initializing object specific values.
* It is created using the same name of our class name.
* constructor area is getting called automatically when object/instance  is created. 
[object-->instance] [class is instantiated]
* constructor doesn't have any return type.
* Default constructor is invisible.
* This `default constructor` will call the no-argument constructor of the [superclass.]
* The compiler automatically provides a no-argument, default constructor for any class without constructors.
* Once we overload constructor, it becomes visible.
* once we have visible constructor,there is no,no-argument constructor.
* Constructor can be private just as private method, variable, class etc.


# Points to Notice
Fields will be asigned with default values.(only we declare on global scope varibale then the default value is this)
byte,short,int,long: 0
float,double: 0.0
boolean: false
char:''(empty)
String: null


# This keyword:
* it refer to the current object of same class.  
* this can be used only inside non-static[object specific] area or context.
* inside static blocks,static methods we cannot use this keyword.


# Don't forget Additional Points:
* if you don't provide any constructor explicitly in a class, Java provides a default constructor automatically. 
* The default constructor initializes the object by calling the no-argument constructor of its superclass (the superclass's default constructor). 
* This happens implicitly, even if you don't explicitly call `super()`.



```java
class Animal {
    public Animal() {
        System.out.println("Animal class constructor");
    }
}

class Dog extends Animal {
    // No explicit constructor defined
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Creating an instance of Dog
    }
}
```

- We have a class `Animal` with a constructor that prints "Animal class constructor".
- We have a class `Dog` which extends `Animal` but doesn't have any explicit constructor.
- In the `Main` class, when we create an instance of `Dog` (`Dog myDog = new Dog();`), Java automatically provides a default constructor for `Dog` since no constructor is explicitly defined.
- Since `Dog` is a subclass of `Animal`, the default constructor of `Dog` implicitly calls the no-argument constructor of its superclass `Animal`. So, when we create an instance of `Dog`, it prints "Animal class constructor".

