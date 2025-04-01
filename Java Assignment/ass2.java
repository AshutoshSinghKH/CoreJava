import java.util.Scanner;

class ass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = input.nextInt();
        
        if ((n & 1) == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
        }
}