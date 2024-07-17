public class SmartTv extends Tv {
    public static void main(String[] args) {
        SmartTv salesman = new SmartTv();
        SmartTv myTv = salesman.purchase(10000);// method calling
    }

    public SmartTv purchase(int amount)// method Signature
    {
        SmartTv samsung = new SmartTv();
        return samsung;
    }
}