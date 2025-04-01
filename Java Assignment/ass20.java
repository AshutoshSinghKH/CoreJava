import java.util.Scanner;

class ass20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        
        int result = (x >= 0) ? x : -x;
        
        System.out.println("The absolute value is: " + result);
        
            }
}
