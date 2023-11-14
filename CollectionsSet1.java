package AtiCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSet1 {

	public static void main(String[] args) {
		
		
		System.out.println();
		Set<Integer> Numero = new HashSet<Integer>();
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0; x<10; x++) {
			System.out.println("digite um numero: ");
			Numero.add(leia.nextInt());
		
		System.out.println(Numero);
		
		Iterator<Integer> num = Numero.iterator();
		
		while(num.hasNext()) {
			System.out.println(num.next());
		}

	}

	}
}
