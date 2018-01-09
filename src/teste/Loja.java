package teste;

import java.util.Scanner;

public class Loja {

	
	public static void main(String[] args) {

		int n, pares = 0;
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
	
		// recebe num de meias
        while(n>100 || n<1) {
        	System.out.println("N de meias maior que 100 ou menor que 1");
        	n = Integer.parseInt(sc.next());
        }
		
        // recebe tamanho das meias
		int[] c = new int[n];
		for (int i = 0; i < c.length; i++) {
			c[i] = Integer.parseInt(sc.next());
	        while(c[i]>100 || c[i]<1) {
	        	System.out.println("tamanho das meias maior que 100 ou menor que 1");
	        	c[i] = Integer.parseInt(sc.next());
	        }
		}

		// sort

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < (c.length - 1); j++) {
				if (c[j] > c[j + 1]) {
					int aux = c[j];
					c[j] = c[j + 1];
					c[j + 1] = aux;
				}
			}
		}

		// conta os pares

		int i = 0;
		while (i < (c.length - 1)) {
			if (c[i] == c[i + 1]) {
				pares++;
				i = i + 2;
			} else {
				i++;
			}
		}

		System.out.printf("%d", pares);

	}

}
