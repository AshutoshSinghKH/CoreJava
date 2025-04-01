import java.util.Scanner;

public class ass6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("first number");
        int num1 = input.nextInt();
        
        System.out.println("second number");
        int num2 = input.nextInt();
        
        System.out.println("third number");
        int num3 = input.nextInt();
        
        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        
        System.out.println("Largest number " + largest);
        
            }
}
