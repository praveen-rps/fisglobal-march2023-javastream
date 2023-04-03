package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> data = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		data.add(10);
		data.add(4);
		data.add(12);
		data.add(24);
		data.add(6);
		System.out.println(data);
		/*
		for(int x: data) {
			if(x%4==0)
				result.add(x);
		}
		for(int x: data) {
			result.add(++x);
		}
		*/
		Predicate<Integer> p = x -> x%4==0;
	//	result = data.stream()
					// .filter(p)
					// .collect(Collectors.toList());
		long result1 = data.stream().filter(p).count();
		
		System.out.println("The number of elements:"+result1);
		
		
		
		

	}

}
