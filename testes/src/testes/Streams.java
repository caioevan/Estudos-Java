package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Streams {

	public static void main(String[] args) {		
		List<Integer> rangeNumeros = new ArrayList<Integer>();
		
		AddNumeros(rangeNumeros);
		
		System.out.println(rangeNumeros);
		
		Predicate<Integer> pares = n -> n%2 ==0;
		
		rangeNumeros.stream()
			.filter(pares)
			.forEach(System.out::println);
	}
	
	public static void AddNumeros (List<Integer> list) {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(rand.nextInt(31));
		}
	}
}
