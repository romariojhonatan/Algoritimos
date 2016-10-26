import java.util.Scanner;

public class Calculo {
	public static int calcular (char p, char q, char r) {
		char etapa1 = (char) etapa1(p, q, r); 
		char etapa2 = (char) etapa2(p, q, r);
		char x;
		if ((etapa1 == 'v') && (etapa2 == 'v')) {
			x = 'v';
		} else if ((etapa1 == 'f') && (etapa2 == 'f')) {
			x = 'v';
		} else {
			x = 'f';
		}
		return  x;
	}
	
	public static int etapa1 (char p, char q, char r) {
		char x, y;
		if ((q == 'v' ) && (r == 'v')) {
			x = 'v';
		} else {
			x = 'f';
		}
		if ((p == 'f') || (x == 'f')) {
			y = 'f';
		} else {
			y = 'v';
		}
		
		return y;
	}
	
	public static int etapa2 (char p, char q, char r) {
		char x, y, z;
		if ((p == 'f') || (q == 'f')) {
			x = 'f';
		} else {
			x = 'v';
		}
		if ((p == 'f') || (r == 'f')) {
			y = 'f';
		} else {
			y = 'v';
		}
		if ((x == 'f') || (y == 'f')) {
			z = 'f';
		} else {
			z = 'v';
		}
		
		return z;
	}
	
	public static int verificacao (char x) {
		Scanner ler = new Scanner(System.in);
		char y = 'r';	
		
		do {
			switch (x) {
			case 'f':
				y = 'f';
				break;
			case 'v':
				y = 'v';
				break;
			case 'F':
				y = 'f';
				break;
			case 'V':
				y = 'v';
				break;
			default:
				System.out.println("\nValor digitado não permitido!!!");
				System.out.print("Por favor digita f (falso) ou v (verdadeiro):");
				x = ler.nextLine().charAt(0);
				break;
			}
		} while (y == 'r');
		return y;
	}

}
