class ass6{
	public static void main(String[] args){
		int x=12,
                 int y=78,
                   int z=12;
		int t = ((x>y && x>z)? x : (y>x && y>z)? y : z);
		System.out.println("largest is"+t);
	}
}	