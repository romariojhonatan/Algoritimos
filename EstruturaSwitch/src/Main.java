import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mes;
		String s;
		
		do {
			System.out.println("Informe o numero:");
			mes = ler.nextInt();
			switch (mes) {
			case 1:
				s = "Janeiro";
				break;
			case 2:
				s = "Fevereiro";
				break;
			case 3:
				s = "Mar�o";
				break;
			default:
				s = "M�s invalido.";
				break;
			}
			System.out.println(s);
		} while (s == "M�s invalido.");
				
		
		ler.close();
	}
}
