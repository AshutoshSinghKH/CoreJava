class ass17 {
    public static void main(String[] args) {
        int num1 = 10; 
        int num2 = 5;
        int num3 = 20;
        int num4 = 15;

        int result = (num1 < num2) 
                    ? ((num1 < num3) 
                        ? ((num1 < num4) ? num1 : num4) 
                        : ((num3 < num4) ? num3 : num4)) 
                    : ((num2 < num3) 
                        ? ((num2 < num4) ? num2 : num4) 
                        : ((num3 < num4) ? num3 : num4));

        System.out.println("The minimum of the four numbers is " + result);
    }
}
