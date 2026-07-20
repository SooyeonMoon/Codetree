import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        p1.name = "codetree";
        p1.code = 50;

        Product p2 = new Product();
        p2.name = sc.next();
        p2.code = sc.nextInt();

        System.out.println("product " + p1.code + " is " + p1.name);
        System.out.println("product " + p2.code + " is " + p2.name);
    }
}

class Product {
    String name;
    int code;

    public Product() {
        name = "";
        code = 0;
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}