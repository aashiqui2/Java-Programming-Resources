public class Driver
{
public static void main(String[] args)
{
PetrolBank hp=new PetrolBank();
//hp.petrol_price=50;
//System.out.println(hp.petrol_price);//can't access beacuse it is private
//System.out.println(hp.disel_price);//can't access beacuse it is private
float petrol=hp.get_petrol_price();
System.out.println(petrol);
int disel=hp.get_disel_price();
System.out.println(disel);
hp.set_disel_price(250);
disel=hp.get_disel_price();
System.out.println(disel);

}
}