package application;

import java.util.Arrays;
import java.util.List;

//Com os tipos coringas da pra fzr métodos genéricos que recebem qualquer tipo

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		System.out.println();
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
