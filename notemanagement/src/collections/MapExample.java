package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> maps = new HashMap<>();
		
		maps.put("k1", "India");
		maps.put("k2", "China");
		maps.put("k3", "Japan");
		maps.putIfAbsent("k3", "Australia");
		maps.put("k4", "India");
		System.out.println(maps);
		
		System.out.println(maps.get("k2"));
		System.out.println(maps.getOrDefault("k3", "country"));
		
		Set keys = maps.keySet();
		System.out.println(keys);
		
		Collection vals = maps.values();
		System.out.println(vals);
		
		System.out.println(maps.containsKey("k2"));
		System.out.println(maps.containsValue("india"));
		
		keys.remove("k1");
		System.out.println(maps);
		
		

	}

}
