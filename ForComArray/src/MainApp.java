import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		//Ler 10 inteiros do teclado e colocar no array.
		
		Scanner ler = new Scanner(System.in);
		int a1[] = new int [10];
		
		for (int i = 0; i < a1.length; i++) {
			System.out.print("Digite o numero " + (i + 1) + ": ");
			a1[i] = ler.nextInt();
		}
	
		System.out.println(a1[3]);
		ler.close();
	}
}
