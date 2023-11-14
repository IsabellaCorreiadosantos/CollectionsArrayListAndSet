package AtiCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsArrayList1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> cores = new ArrayList<>();
		Scanner leia = new Scanner(System.in);
		for(int x=0; x<5; x++) {
			System.out.println("digite uma cor: ");
			cores.add(leia.next());
			
		}
			System.out.println(cores);
			Collections.sort(cores);
			System.out.println(cores);

	}

}
