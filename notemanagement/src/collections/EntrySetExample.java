package collections;

import java.util.HashMap;
import java.util.Map;

public class EntrySetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> maps = new HashMap<>();
		maps.put("k1", "India");
		maps.put("k2", "China");
		maps.put("k3", "Japan");
		maps.put("k4", "Nepal");
		System.out.println(maps);
		
		
		for(Map.Entry<String, String> x : maps.entrySet()) {
			System.out.println(x.getKey()+"---->"+x.getValue());
			 
		}
		
		

	}

}
