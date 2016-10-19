import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;
		
		do			
        {
			System.out.println("Bom dia!!!!");
			System.out.println("Informe o numer 5 para sair:");
			numero = ler.nextInt();
			
        } while (numero != 5);
		ler.close();
	}

}
