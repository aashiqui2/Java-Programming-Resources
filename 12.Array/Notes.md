# Array
* what is Array?
[collection of similar dataypes]

* why should i learn Array?
[to avoid multiple variables useage/declaration]

* when i should use Array?
[whenever i want to store more number of values]

* how should i use Array?
[] is used and using new keyword

Array: (mostly 99%) (because we have object array)

Collection of similar datatypes.

அணி -Team /Group /Collection.


# variables
int a=5,b=2;
without the variables and object we cannot write programs.

we need 1000 variables.
TNPSC
10 L -->5 SUBJECT -->50 L VARIABLES

int m1=??;
int m2=??;
int m3=??;
int m4=??;
int m5=??;


Java --> Symbol -->[]

- int[] marks={100,100,100,100,100};
- boolean[] results={true,false,true,false.true,false};
- char[] name={'r','a','n'};
- float[] values={1.3f,3.12f};
double[] d={1.2d,34.5d};

[8 primitive]

Non-primitive Dataypes Arrays:
-->Every class we have /create.

String[] names={"ram","gopal",kumar"};

- Employee emp1=new Employee();
- Employee emp2=new Employee();
- Employee emp3=new Employee();
- Employee emp4=new Employee();
- Employee emp5=new Employee();

Employee[] emp={emp1,emp2,emp3,emp4,emp5};

1) +2 Mark --> 6 subject -->total -->percentage

int[] marks={100,90,70};

int[] marks =new int[6];


String[] names=new String[5];
String is a `class` name is a `object`



1) Values will be continues stored?
yes

2) Arrays, we have their own default values based on their datatypes.
# by default the array will be like this
- int -->0
- float -->0.0
- long -->0
- double -->0.0
- char -->''
- boolean -->false
- string -->null

can we print the array like this?
```java
int[] marks={100,90,70};
sysout(marks);
```

when we create a anything with `new keyword` it is said to be `object`.

if array is object then it must have a class .

can we print object?
No

Example:
- TV--> OBJECT
- Password photo- print

can we print object yes it depends on object
some object can we printed and some cannot.

3) Array is index based.
- Index starts from zero (0).
- Array elements:Non of elements:-->3
- length of the given array: 3
- index starts from 0 ends at length -1.

- occupies continous space
(Unused memory is wasted)
- fixed memory size
- It is Homogenous(once type is declared it can store only smae type)


# String[] a=new String[214748364];
we cannot give negative arry size
String[] a=new String[-4]; 
//run time error
---------------

# what is the purpose of new keyword?

In java array is considered as `Object.`

## when the memory is allocated to the object
Compile time/ Run time

`run Time`

we can have zero sized array


Jagged Array
 int arr_name[][] = new int[][]  {
                                  new int[] {10, 20, 30 ,40},
                                  new int[] {50, 60, 70, 80, 90, 100},
                                  new int[] {110, 120}
                                      };
                                      
                              OR                                     
                                                         
                    int[][] arr_name = {
                          new int[] {10, 20, 30 ,40},
                          new int[] {50, 60, 70, 80, 90, 100},
                          new int[] {110, 120}
                              };
                              
                              OR                                     
                                                         
                    int[][] arr_name = {
                           {10, 20, 30 ,40},
                           {50, 60, 70, 80, 90, 100},
                           {110, 120}
                              };










