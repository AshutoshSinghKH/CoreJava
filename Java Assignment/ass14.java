class ass14 {
    public static void main(String[] args) {
        int x = 53;
        int count = 0;

        while (x > 0) {
            x = x & (x - 1);
            count++;
        }

        System.out.println("The number of set bits is: " + count);
    }
}