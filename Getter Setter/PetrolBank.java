public class PetrolBank
{//java beans -POJO class -Plain Old Java Objects
private float petrol_price=103.5f;//final
private int disel_price=100;//final

public void set_disel_price(int ltr)
{
if(ltr>100){
this.disel_price=99;
}
}
float get_petrol_price()
{
return this.petrol_price;
} 
int get_disel_price()
{
return this.disel_price;
}
}