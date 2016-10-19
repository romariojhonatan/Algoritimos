import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("p v (q ^ r) <--> (p v q) ^ (p v r)");
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor de p: ");
		char p = ler.nextLine().charAt(0);
		p = (char) Calculo.verificacao(p);
		
		System.out.print("Digite o valor de q: ");
		char q = ler.nextLine().charAt(0);
		q = (char) Calculo.verificacao(q);
		
		System.out.print("Digite o valor de r: ");
		char r = ler.nextLine().charAt(0);
		r = (char) Calculo.verificacao(r);
		
		char x = (char) Calculo.calcular(p, q, r);
		System.out.println("" + x);
		
		ler.close();
		//toUpperCase();
		//toLowerCase();
	}

}
