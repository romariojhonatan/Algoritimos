public class Main {
	
	public static void main(String[] args) {
		
		int[] a = Ultil.pegaValores(3);		
		int valorMinimo = Ultil.min(a);
		int valorMaximo = Ultil.max(a);
		int media = Ultil.media(a);
		
		System.out.println("O valor maximo é " + valorMaximo);
		System.out.println("O valor minimo é " + valorMinimo);
		System.out.println("A media é " + media);
		
	}

}
