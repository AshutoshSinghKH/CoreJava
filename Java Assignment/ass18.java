import java.util.Scanner;

class ass18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the percentage");
        int x = input.nextInt();
      
        String result = ((x > 40) ? "Pass" : "Fail");
        System.out.println("The number is: " + result);
    }
}