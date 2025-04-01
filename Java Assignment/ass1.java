import java.util.Scanner;

public class ass1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int a = input.nextInt();
        
        System.out.println("Enter the second number:");
        int b = input.nextInt();
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

}
}