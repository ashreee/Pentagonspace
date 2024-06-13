class Flipkart2 {
    String pname;
    double price;
    double qty;

    double addToCart(String pname, double price, double qty) {
        double sum = price * qty;
        System.out.println("Total amount in cart: " + sum);
        return sum;
    }

    double calculatInstallment(double total, int nom) {
        double amount = total / nom;
        System.out.println("Total amount: " + amount);
        return amount;
    }

    public static void main(String[] args) {

        Flipkart2 f = new Flipkart2();
        f.pname = "shirt";
        f.price = 1000;
        f.qty = 6;
        double total = f.addToCart(f.pname, f.price, f.qty);
        f.calculatInstallment(total, 4);
    }
}
