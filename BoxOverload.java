class Box {
    double length, breadth, height;

    Box() {
        length = 0;
        breadth = 0;
        height = 0;
    }

    Box(double side) {
        length = side;
        breadth = side;
        height = side;
    }

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void volume() {
        System.out.println("Volume = 0");
    }

    void volume(double side) {
        System.out.println("Volume = " + (side * side * side));
    }

    void volume(double length, double breadth, double height) {
        System.out.println("Volume = " + (length * breadth * height));
    }
}

class BoxOverload {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(5, 4, 3);

        b1.volume();
        b2.volume(5);
        b3.volume(5, 4, 3);
    }
}
