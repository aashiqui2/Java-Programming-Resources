class TCS_Vellore extends ChennaiSilks {
    public TCS_Vellore(int amount) {
        super(amount);// new Chennaisilks(amount);
        // parent class- super class -base class
        // explicit constructor calling of super class
        System.out.println("Lot- TVS Scooty");
        System.out.println("New YEar Calander");
    }

    public static void main(String[] args) {
        TCS_Vellore shirt = new TCS_Vellore(1000);

    }
}