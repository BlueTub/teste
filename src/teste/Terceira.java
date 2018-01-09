package teste;

import java.util.Scanner;

public class Terceira {

//incompleto
	
	public static void main(String[] args) {
		String s = null,aux = null,aux2;
		StringBuilder s1 = new StringBuilder();
		int i,j, k, l;
        Scanner sc = new Scanner(System.in);

        s1.append(sc.next());
        
        i = Integer.parseInt(sc.next());
        j = Integer.parseInt(sc.next());       
        k = Integer.parseInt(sc.next());
        l = Integer.parseInt(sc.next());
        
        //aux=s.substring(i,i);
        //aux2=s.substring(j,j);
        
       // s1.setCharAt(i, s1.);

        System.out.println(s);       
        
        //verifica se é pali
        //int i = 0;
        while (i < aux.length()) {
                if (aux.charAt(i) != aux.charAt(aux.length() - i -1)) {
                        System.out.println("No");
                        System.exit(0);
                }
                i++;
        }
        System.out.println("Yes");
        //
	}

}
