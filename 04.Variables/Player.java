class Player{

static String country="India";
int score;//Non-static

public static void main(String args[])
{
Player rohit=new Player();
Player virat=new Player();
Player dhoni=new Player();

virat.score=46;
rohit.score=56;
dhoni.score=58;

// rohit.bowl();
// virat.bat();
// dhoni.keep();

rohit.bat();
virat.bat();
dhoni.bat();

System.out.println(Player.country);
System.out.println(rohit.country);//using object reference
System.out.println(rohit.score);
System.out.println(dhoni.score);


}
void keep()
{
System.out.println("Keeping");
}

void bat()
{
int score=20;//local variable
float strike_rate=78.5f;//local variable
System.out.println("batting with "+score+" "+strike_rate);// concatenate
}

void bowl()
{
System.out.println("Bowling");
}

}