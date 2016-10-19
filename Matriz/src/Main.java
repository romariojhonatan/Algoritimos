import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String[][] m = new String[5][5];
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				m[i][j] = "[" + i + "," + j + "]";	
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		ler.close();
	}

}
