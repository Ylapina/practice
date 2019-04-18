import java.util.ArrayList;
import java.util.List;

public class Closet {

	public static void main(String[] args) {
		String [] closet = {"hats", "pants","skirts"};
		List<String> List1=new ArrayList<String>();
		
		for(String x: closet) {
			List1.add(x);
		}
		
		for(int i=0;i<List1.size();i++) {
			System.out.println("Closet list of items "+List1.get(i));
		}
		String[] shelve= {"belt","sunglasses"};
		List<String>List2=new ArrayList<>();
		
		for(String s: shelve) {
			List2.add(s);
		}
		System.out.println("items in shelve"+List2);
		
		
		
		
		

	}

}
