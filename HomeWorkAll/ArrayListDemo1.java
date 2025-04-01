import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; // this is imp line java package

public class ArrayListDemo1 {

	public static void main(String[] args) {
		

		List<String> a11 = new ArrayList<>();
		a11.add("Tushar");
		a11.add("Kiran");
		a11.add("Mukesh");
		a11.add("Isha");
		a11.add("Mukesh");
		System.out.println(a11);
		
		System.out.println(a11.get(2)); 
		System.out.println(a11.get(4));

                //Traversing : Method 1                 
		for(int i=0;i< a11.size();i++) {
			System.out.println(a11.get(i));
		}
		
		a11.remove(0);
		System.out.println("It will remove the tushar" +a11);
		a11.remove("Kiran");
		System.out.println(a11);
		System.out.println("-------1------");
		
		//Traversing : Method 1               here only show the remaining names beacuse we already removed two.
		
		for(int i=0;i< a11.size();i++) {
			System.out.println(a11.get(i));
		}


		System.out.println("------2-------");
		//Traversing : Method 2
		

                     for(String x : a11) 
                {
			System.out.println(x);
		}
		/*
		System.out.println("--------3-----");
		//Traversing : Method 3
		Iterator<String> itr = a11.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());

}
*/

			

	}

}