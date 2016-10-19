package ifTernario;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String string;
		boolean condicao = true;
		if (condicao) {	
			string = "s";
		} else {
			string = "n";
		}
		
		string = condicao ? "s" : "n";
		
		Scanner ler = new Scanner(System.in);
		System.out.println(string);
		ler.close();
	}

}
