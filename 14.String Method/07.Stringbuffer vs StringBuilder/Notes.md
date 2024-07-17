# String -Immutable ,StringBuffer,StringBuilder
when String object needs to be modified very often we should not use string object.

## StringBuffer -java.lang - Mutable class -synchronized class
we cannot make the string literal as mutable by using the StringBuffer.
`StringBuffer sb="abc;`

# Synchronized 
A thread-safe, mutable sequence of characters. A string buffer is like a String, but can be modified.
As of release JDK 5, this class has been supplemented with an equivalent class designed for use by a single thread, StringBuilder. The StringBuilder class should generally be used in preference to this one, as it supports all of the same operations but it is faster, as it performs no synchronization.

* String Buffer is thread safe
* all methods are synchronized methods


# Synchronized
mobile--->speaker 

playsong()--speaker 
Incomeingcall()--speaker 
-seqential action



# StringBuilder - non synchronized class -java.lang -Mutable class -JDK 1.5 ->
A mutable sequence of characters. This class provides an API compatible with StringBuffer, but with` no guarantee of synchronization`. 
# Not synchronized
laptop -two browser -chrome -firefox-- all play simultaniously
(multiple activity)

parallel actions

String Builder is not thread safe
all methods are not  synchronized methods