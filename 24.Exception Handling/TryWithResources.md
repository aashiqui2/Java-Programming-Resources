# Prerequisites;
Exception Handling: try catch finally
File Reading:File,FileReader,BufferReader:

try block:Exception Possible Area
catch block: Exception Handling Area
finally :Resources Handling

`finally block will always get exceuted`
try
{

}
catch(Exception e){

}
finally
{

}
To increase code readablity we use trywith resources.


The resource type Demo does not implement 
java.lang.AutoCloseable

# AutoCloseable Interfaces
An object that may hold resources (such as file or socket handles) until it is closed. The close() method of an AutoCloseable object is called automatically when exiting a try-with-resources block for which the object has been declared in the resource specification header. 