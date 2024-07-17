class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double wid, double hei, double dep) {
        width = wid;
        height = hei;
        depth = dep;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
        System.out.println(len);
    }

    double volume() {
        return width * height * depth;
    }
}

class Overload {
    public static void main(String args[]) {

        Box mybox1 = new Box(100, 200, 150);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;

        vol = mybox1.volume();

        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();

        System.out.println("Volume of mybox2 is " + vol);

        vol = mycube.volume();

        System.out.println("Volume of cube is " + vol);

        vol = myclone.volume();

        System.out.println("Volume of clone is " + vol);

    }
}