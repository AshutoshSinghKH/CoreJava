import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList a1 = new ArrayList();    //Non type safe
		//ArrayList<String> a11 = new ArrayList<>();   //Type safe.... This means that a11 can only reference an ArrayList.
                List<String> a11 = new ArrayList<>(); // mai isko iss tarah bhi likh sakta kyu ki mam ne bola tha ArrayList inherits the List and List to Collection
		
                a11.add("Ramesh");
		a11.add("Suresh");
		a11.add("Sohan");
		a11.add("drunk");
		a11.add("keshav");
		System.out.println(a11);
		
		System.out.println(a11.get(0));       // indexing
		System.out.println(a11.get(1));
                System.out.println(a11.get(2));
		System.out.println(a11.get(3));
                System.out.println(a11.get(4));

		a11.remove(2);
		System.out.println(a11);
		a11.remove("keshav");
		System.out.println(a11);// it will print only [Ramesh, Suresh, drunk] it means it will not show the removed content.
		
		
		

	}

}