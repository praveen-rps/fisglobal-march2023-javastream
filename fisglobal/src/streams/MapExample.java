package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample {

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
		Function<Integer,Integer> f = x->++x;
		result = data.stream()
				 .map(f)
				 .collect(Collectors.toList());
		System.out.println(result);

	}

}
