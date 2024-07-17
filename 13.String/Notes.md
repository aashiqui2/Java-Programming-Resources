# Java String
 `String` is a class. It represents a sequence of characters. Java treats strings as objects of the `String` class rather than as primitive data types. The `String` class provides many methods for manipulating strings, such as concatenation, substring extraction, comparison, searching, and replacing.[String is Immutable in nature]

1) String is a class - `non primitive datatype`
- java.lang.package
- collection of characters

2) String is a special class -Specialities?
 - If String is class means we can create a object like this

### **First specialities**:
   `Classname reference =new Classname()`;

**To create a object for String we have two ways:**

   - Using the String Constructor

      `String str1= new String("Muthu")  //object`
   - Using String literals

     ` String str1="Arun" //string literal`

**second specialities**
* `+ Addition operator`
* `concatenation operator`



```java
public class StringExample {
    public static void main(String[] args) {
        // Declaring and initializing string variables
        String str1 = "Hello"; // String literal
        String str2 = new String("World"); // Using the String class constructor
        
        // Concatenating strings
        String combined = str1 + ", " + str2;
        
        // Outputting the combined string
        System.out.println(combined);
    }
}
```

# **String is immutable**
Once we create a string,it cannot be edited.if we edit the string literal (or) Object, a new string object (or) literal will be created.

# Heap and SCP
<img src="./img/Heap memory and scp.png">

To understand string are immutable look below:

<img src="./img/string is immutable.png">
