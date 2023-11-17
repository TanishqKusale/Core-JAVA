package functional_strms;

import java.util.List;

public class Test7 {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6,7);
		System.out.println("seq accessed strm");
		list.stream().forEach(System.out::println);
		System.out.println("parallel accessed strm");
		list.parallelStream().forEach(System.out::println);
		

	}

}
