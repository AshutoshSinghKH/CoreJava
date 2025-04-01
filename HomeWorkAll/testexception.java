class testexception {
    public static void main(String[] args) {
        String str = null;
        int a = 50, b = 0, c;

        try {
            c = a / b; 
            System.out.println(c);
        } 
           // i can also use Exception e it can handle any type of exception.
            catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
            System.out.println("Division by zero is not allowed.");
        }

        try {
            System.out.println(str.toUpperCase()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
            System.out.println("String is null.");
        }

        System.out.println("The end");
    }
}



pending