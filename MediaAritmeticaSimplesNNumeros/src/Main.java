import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		System.out.println("Digite um número negativo quando quiser parar !!");
		//--------------------------------------INICIALIZANDO NUMEROS--------------------------------------------
		int contador = -1;
		int numero = 0;
		int media = 0;
		int total = 0;
		//----------------------------------SOMANDO E PERGUNTANDO VALORES-----------------------------------------
		do {
			contador = contador + 1;
			total = total + numero;
			System.out.println("Digite o número: ");
			numero = ler.nextInt();
		} while (numero >= 0);
		//-------------------VERIFICANDO SE HOUVE PELO MENOS UMA ITERAÇÃO PARA CALCULAR A MÉDIA-------------------
		if (contador > 0) {
			media = total / contador;
		} else {
			media = 0;
		}
		//------------------------------------APRESENTANDO RESULTADO----------------------------------------------
		System.out.println("Média Aritmética Simples:" + media);
		ler.close();
	}
}
