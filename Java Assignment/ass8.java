class ass8 {
    public static void main(String[] args) {
        boolean a = true;   
        boolean b = false;  
        boolean c = true;   

        boolean result = (a && b) || (a && c) || (b && c);
        
        System.out.println(result);
    }
}