class ass3{
	public static void main(String[] args){
		int x = 4526;
		int y = 0;
		while(x!=0){
			y = y + (x % 10);
			x = x/10;
		}
		System.out.println("Sum: " + y);
	}
}