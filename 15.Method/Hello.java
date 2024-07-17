class wow
{
public static void main(String args[])
{
//System.out.println("hello");
//System.out.println(args[0]);
//System.out.println(args[1]);

// for( int i=1;i<=10;i++);  // <- semicolon here means the loop body is empty
// {
// System.out.println(i);//cannot find symbol
// }

int i;
for(  i=1;i<=10;i++);  // <- semicolon here means the loop body is empty

{
System.out.println(i);
}

if(i<10)// 'else' without 'if'
System.out.println("true "+i);
System.out.println(i); 


// else; //else without statement
System.out.println("false");

}
}

