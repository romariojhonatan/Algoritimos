import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int array[] = new int[5];
		int par[] = new int[5];
		int impa[] = new int[5];
		
		System.out.println("Sejam Bem Vindos!");
		
		for (int i=0; i<5; i++){
			System.out.print("Informe o numero " + (i + 1) + ": ");
			array[i] = ler.nextInt();
			par[i] = -1;
			if (array[i] % 2 == 0 ) {
				par[i] = array[i];
			}
			if (array[i] % 2 == 1 ) {
				impa[i] = array[i];
			}
		}
		System.out.println("Os numeros par digitados foram:");
		for (int i = 0; i < par.length; i++) {
			if (par[i] >= 0) {
				System.out.println(par[i]);
			}
		}
		System.out.println("Os numeros impa digitados foram:");
		for (int i = 0; i < impa.length; i++) {
			if (impa[i] != 0) {
				System.out.println(impa[i]);
			}
		}
		ler.close();
	}
}
