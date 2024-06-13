
class Calculator {
    String brand = "CASSIO";
    double price = 1100;

    double add(int a, double b) {
        double sum = a + b;
        return sum;
    }

    double sub(double a, int b) {
        double sub = a - b;
        return sub;

    }

    double mul(double a, double b) {
        double mul = a * b;
        return mul;

    }
}

class Demo {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        double s1 = c.add(50, 45.50);
        System.out.println("Sum is " + s1);
        double s2 = c.sub(50, 30);
        System.out.println("Sub is " + s2);
        double m3 = c.mul(s1, s2);
        System.out.println("Mul is " + m3);

    }
}