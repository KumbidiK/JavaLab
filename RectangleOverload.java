class Rectangle {
    double length, breadth;

    Rectangle() {
        length = 1;
        breadth = 1;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(double side) {
        length = side;
        breadth = side;
    }

    void displayArea() {
        System.out.println("Area = " + (length * breadth));
    }
}

class RectangleOverload {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 5);
        Rectangle r3 = new Rectangle(7);

        r1.displayArea();
        r2.displayArea();
        r3.displayArea();
    }
}
