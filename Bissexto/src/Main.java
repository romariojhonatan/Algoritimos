import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int op;
		System.out.println("=========BENVINDO==========");
        System.out.println("|  1. Os anos de x at� y  |");
        System.out.println("|  2. Ano �?              |");
        System.out.println("|  3. Sair                |");
        System.out.println("===========================");
        
        do{
        	System.out.print("Op��o: ");
        	op = ler.nextInt();
            System.out.println("");
            
            switch( op ) {
                case 1:
                    Calculo.Anos();
                    op = 3;
                    break;
                case 2:
                    Calculo.Ano();
                    op = 3;
                    break;
                case 3:
                	System.out.println("---------------");
                    System.out.println("Volte sempre!!!");
                    System.out.println("---------------");
                    break;
                default:
                	 System.out.println("--------------------------------");
                     System.out.println("Numero informado n�o confere!!!" );
                     System.out.println("Informe outro numero!!!"         );
                     System.out.println("--------------------------------");
                     	
            }               
        }while(op != 3);
            ler.close();
    }

}