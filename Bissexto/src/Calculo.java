import java.util.Scanner;

public class Calculo {
	static void Anos(){
        Scanner ler = new Scanner(System.in);

        System.out.print("Ano x: ");
        int x = ler.nextInt();
        System.out.print("Ano y: ");
        int y = ler.nextInt();

        for (int i = x; i < y + 1; i++) {
            if(i % 400 == 0){
                System.out.println(i + " � bissexto.");
            } else if((i % 4 == 0) && (i % 100 != 0)){
                System.out.println(i + " � bissexto.");
            } else{
                System.out.println(i + " n�o � bissexto");
            }
        }
        ler.close();
    }

    static void Ano(){
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        int ano = ler.nextInt();

        if(ano % 400 == 0){
            System.out.println(ano + " � bissexto.");
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " � bissexto.");
        } else{
            System.out.println(ano + " n�o � bissexto");
        }
        ler.close();
    }
}
