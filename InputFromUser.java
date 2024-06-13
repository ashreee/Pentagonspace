import java.util.Scanner;

public class InputFromUser {

    double add(int a, double b) {
        double sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        double b = sc.nextDouble();
        InputFromUser i = new InputFromUser();
        double s1 = i.add(a, b);
        System.out.print("Total=" + s1);
        sc.close();
    }
}