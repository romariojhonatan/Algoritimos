import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		System.out.println("Digite um n�mero negativo quando quiser parar !!");
		//--------------------------------------INICIALIZANDO NUMEROS--------------------------------------------
		int contador = -1;
		int numero = 0;
		int media = 0;
		int total = 0;
		//----------------------------------SOMANDO E PERGUNTANDO VALORES-----------------------------------------
		do {
			contador = contador + 1;
			total = total + numero;
			System.out.println("Digite o n�mero: ");
			numero = ler.nextInt();
		} while (numero >= 0);
		//-------------------VERIFICANDO SE HOUVE PELO MENOS UMA ITERA��O PARA CALCULAR A M�DIA-------------------
		if (contador > 0) {
			media = total / contador;
		} else {
			media = 0;
		}
		//------------------------------------APRESENTANDO RESULTADO----------------------------------------------
		System.out.println("M�dia Aritm�tica Simples:" + media);
		ler.close();
	}
}
