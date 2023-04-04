package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> fact = x->{
			int f=1;
			for(int i=1;i<=x;i++)
				f=f*i;
			System.out.println(f);
		};
		fact.accept(5);
		
		
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		nums.forEach(fact);

	}

}
