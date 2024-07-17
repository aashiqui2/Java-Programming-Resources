public class Customer {
    String name, pan, address;
    long mob, dob, aadhar;

    public Customer(String name, long dob, long mob, String address, String pan) {
        this.name = name;
        this.dob = dob;
        this.mob = mob;
        this.address = address;
        this.pan = pan;
    }

    public Customer(String name, long aadhar) {// for storing object specific values
        this.aadhar = aadhar;
        this.name = name;
    }

    public static void main(String[] args) {
        Customer anbu = new Customer("anbu", 01012001, 781, "Erode", "BIHSOIO2");
        Customer selvam = new Customer("selvam", 20842);
        anbu.getloan();
        selvam.getloan();
    }

    void getloan() {
        System.out.println(name);
        System.out.println("Can get loan");
    }
}
