package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeySetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List> orgs = new HashMap<>();
		List<Integer> f1 = new ArrayList<>();
		f1.add(100);
		f1.add(120);
		f1.add(90);
		f1.add(110);
		List<Integer> f2 = new ArrayList<>();
		f2.add(90);
		f2.add(89);
		f2.add(100);
		f2.add(95);
		List<Integer> f3 = new ArrayList<>();
		f3.add(75);
		f3.add(80);
		f3.add(82);
		f3.add(91);
		
		orgs.put("2020", f3);
		orgs.put("2021", f2);
		orgs.put("2022", f1);
		System.out.println(orgs);
		
		for(Map.Entry<String, List> x : orgs.entrySet()) {
			System.out.println(x.getKey()+"-->Quarter Values are:");
			List<Integer> temp = x.getValue();
			for(int n: temp) {
				System.out.println(n);
			}
			 
		}
		

	}

}
