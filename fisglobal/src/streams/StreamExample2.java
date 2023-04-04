package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(12);
		nums.add(4);
		nums.add(27);
		nums.add(8);
		
		//List<Integer> result = nums.stream().filter(x->x%4==0).collect(Collectors.toList());
		
	//	List<Integer> result = nums.stream()
	//							   .filter(x->x%4==0)
	//							   .sorted((s1,s2)->-(s1-s2)).collect(Collectors.toList());
		
			int result=		nums.stream()
				   .filter(x->x%4==0)
				    .min((s1,s2)->(s1-s2)).get();
		
		System.out.println(result);

	}

}
