class ass13 {
    public static void main(String[] args) {
        int x = -10; 
        int y = x >> 31;
        int z = (x + y) ^ y;
        
        System.out.println("The absolute value" + z);
    }
}