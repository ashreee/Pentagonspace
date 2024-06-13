class Calculator{
    String brand="CASSIO";
    double price=1100;

void add(int a, double b){
    double sum=a+b;
    System.out.println("Sum=" +sum);
}
void sub(int a, int b){
    int sub=a-b;
    System.out.println("Sub=" +sub);
}
void mul(int a, int b){
    int mul=a*b;
    System.out.println("Product=" +mul);
}
}
class Test{
    public static void main(String[] args){
        Calculator c=new Calculator();
        c.add(50,45.50);
        c.sub(60,30);
        c.mul(60,30);
    }
}