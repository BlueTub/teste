package teste;

import java.util.Scanner;

public class Segunda {

	//incompleto
	
	public static void main(String[] args) {
		
		int t, n;
		Scanner sc = new Scanner(System.in);
		t = Integer.parseInt(sc.next());
		
		//for (int i = 0; i < args.length; i++) {	
		//}
		
		n = Integer.parseInt(sc.next());

		int[] vet = new int[n-1];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.parseInt(sc.next());
		}
		
		

	}

}
