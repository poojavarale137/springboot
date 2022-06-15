import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> obj = new ArrayList<>();
		obj.add(1);
		obj.add(5);
		obj.add(8);
		obj.add(6);
		obj.add(2, 2);
		
		//using iterator
//		Iterator i = obj.iterator();
//		while(i.hasNext()) 
//		{
//			System.out.println(i.next());
//		}
		
		Collections.sort(obj);
		
		obj.forEach(System.out::println);
		
//		enhanced for loop
//		for(Integer  i :obj)
//		{
//			System.out.println(i); 
//		}
	}

}
