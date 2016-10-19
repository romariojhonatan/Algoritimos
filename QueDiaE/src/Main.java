import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual dia: ");
		int dia = ler.nextInt();
		System.out.println("Qual mes: ");
		int mes = ler.nextInt();
		System.out.println("Qual ano: ");
		int ano = ler.nextInt();
		ler.close();
		
		int x = Calculo.conta(dia, mes, ano);
		String oDiaE = null;
		switch (x) {
		case 1:
			oDiaE = "Domingo";
		break;
		case 2:		
			oDiaE = "Segunda";
		break;
		case 3:
			oDiaE = "Terça";
		break;
		case 4:
			oDiaE = "Quarta";
		break;
		case 5:
			oDiaE = "Quinta";
		break;
		case 6:
			oDiaE = "Sexta";
		break;
		case 7:
			oDiaE = "Sabado";
			break;
		case 0:
			oDiaE = "Domingo";
			break;
		}
		System.out.println("O dia " + dia + "/" + mes + "/" + ano + " caiu numa " + oDiaE);
	}

}
