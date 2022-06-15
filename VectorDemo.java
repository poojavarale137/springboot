import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Vector <Integer> v =new Vector<>();
		List<Integer> v =  new ArrayList<>();
		
		v.add(1);
		v.add(7);
		
		
		System.out.println(v.size());
		
		for(int i :v) {
			System.out.println(i);
		}

	}

}
