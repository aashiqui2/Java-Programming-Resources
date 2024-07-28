public class AccountHolder {
    public static void main(String[] args) {
        Bank bb = new Bank();
        // System.out.println(bb.minbalance);
        // bb.minbalance=100;
        int min = bb.getMinbalance();
        System.out.println(min);
        bb.setMinbalance(10000);
        min = bb.getMinbalance();
        System.out.println(min);
    }
}
