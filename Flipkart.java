import java.util.Scanner;

class Flipkart {
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
        System.out.println("Total amount per installment: " + amount);
        return amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flipkart f = new Flipkart();

        System.out.print("Enter product name: ");
        f.pname = sc.nextLine();

        System.out.print("Enter price: ");
        f.price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        f.qty = sc.nextDouble();

        double total = f.addToCart(f.pname, f.price, f.qty);

        System.out.print("Enter number of installments: ");
        int numInstallments = sc.nextInt();

        f.calculatInstallment(total, numInstallments);

        sc.close();
    }
}
