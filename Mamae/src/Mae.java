import java.util.Scanner;

public class Mae {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String n;
		do {
			System.out.println("Voc� est� bem meu filho?");
			n = ler.nextLine();		
		} while (n != "n�o");
		System.out.println("Fim.");
		ler.close();
	}

}
