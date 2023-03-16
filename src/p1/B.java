package p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class B {
	public static void main(String[] args) {
		int [] k= {2,4,5,21,55,67,55,34,55,2,9,8,67};
		int [] unique = Arrays.stream(k).sorted().distinct().toArray();
		int [] even =Arrays.stream(k).filter(num -> num % 2 == 0).toArray();
		int [] odd =Arrays.stream(k).filter(num -> num % 2 != 0).toArray();
		
		double average= Arrays.stream(k).average().orElse(Double.NaN);
		System.out.println("Original array elements:"+Arrays.toString(k));
		System.out.println("After removing array elements:"+Arrays.toString(unique));
		System.out.println("Print only even numbers"+Arrays.toString(even));
		System.out.println("Print only odd numbers"+Arrays.toString(odd));
		System.out.println("Average of the original array:.."+average);
		
		int sum =0;
		for (int i = 0; i < unique.length; i++) {
			sum+=unique[i];
		}
		System.out.print(sum);
		System.out.println("\n");
		int sumoriginal =0;
		for (int i = 0; i < k.length; i++) {
			sumoriginal+=k[i];
		}
		System.out.println(sumoriginal);
		
		int n =unique.length;
		Arrays.sort(unique);
		
		int firstmax = unique[n-3];
		int firstmin =unique[2];
		System.out.println(firstmax+","+firstmin);

		
		String str ="Chilakala farooq";
		List<Character> vowles= Arrays.asList('a','e','i','o','u');
		str.chars()
		.mapToObj(c->(char)c)
		.filter(c->vowles.contains(c))
		.map(Character::toUpperCase)
		.forEach(System.out::print);
	}
	
	}
