class ass11 {
    public static void main(String[] args) {
        int number = 16; 
        boolean x = (number > 0) && ((number & (number - 1)) == 0);
        System.out.println(x ? "The number is a power of 2." : "The number is not a power of 2.");
    }
}