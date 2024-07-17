class Superclass {
    private void display() {
        System.out.println("HI");
    }

    void display1() {
        System.out.println("HI");
    }

    final void show() {
        System.out.println("Showing in superclass");
    }
}

public class Subclass extends Superclass {
    public static void main(String[] args) {
        Subclass y = new Subclass();
        y.display();
        // y.display1();
    }
    //! This is not overriding, it's defining a new method
    public void display() {
        System.out.println(" subclass display");
    }
    // public void display1(){
    // System.out.println("Hello");
    // }
    // protected void display1(){
    // System.out.println("Hello");
    // }
    // void display1(){
    // System.out.println("Hello");
    // }

    // ! A method of super class with default access modifier can be overridden as
    // protected or public but not as private
    // ? do not reduce the visiblility
    // private void display1(){
    // System.out.println("Hello");
    // }

    // ! Cannot override the final method from Superclass
    // public void show(){
    // System.out.println("Showing in subclass");
    // }

}
