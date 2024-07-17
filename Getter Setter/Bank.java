public class Bank{

//final int minbalance=2500;//non static variable 
//if we give final we cannot change it inside the same class

private int minbalance=2500;

public int getMinbalance()
{
return this.minbalance;
}
public void setMinbalance(int value)
{
if(value>2500)
{
this.minbalance=value;
}
}

}

//this class is called POJO class
//plain old java object