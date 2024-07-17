class ChennaiSilks
{
ChennaiSilks()
{
System.out.println("Lord Photo");
}
ChennaiSilks(int amount,int discount)
{
this();
System.out.println("Total bill amount is"+(amount-discount));
}
ChennaiSilks(int amount)
{
this(amount,50);//explicit Constructor calling
//new Chennaisilks()
//current object class
//this refers to current object of same class
System.out.println("Water Bottle");
}
public static void main(String[] args)
{
}
}