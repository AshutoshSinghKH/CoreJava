class num {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println( + math.add(2, 3)); // Calls the first method
        System.out.println( + math.add(2, 3, 4)); // Calls the second method
        System.out.println(+ math.add(2.5, 3.5)); // Calls the third method
    }
}
