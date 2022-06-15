import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(9);
		list.add(4);
		list.add(10);
		list.add(15);
		list.add(16);
		
		
		
		System.out.println(list);
		System.out.println("**************************************************");
		
		List<Integer> newList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		System.out.println("*******************************");
		List<Integer> newList1=list.stream().filter(i ->i>=10).collect(Collectors.toList());
		System.out.println(newList1);
		
		System.out.println("***********************************************************");
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e ->{
			System.out.println(e);
		});
		System.out.println("empty is working");
		
		List<String> names =  new ArrayList<>();
		names.add("pooja");
		names.add("prasad"); 
		names.add("abhishek");
		List<String> newNames=names.stream().filter(e->e.startsWith("p")).collect(Collectors.toList());
		System.out.println(newNames);
		
	}

}
