import java.util.Scanner;

public class Mercado {

	public static void main(String[] args) {
		
		int op=9;
		Cliente clil  = new Cliente();
		Produto prod1 = new Produto();
		NFe NFe = new NFe();
		DetalheNFe detalheNFe = new DetalheNFe();
		
		Scanner ler = new Scanner(System.in);
		
		do {
			
			System.out.println("1. Cadastrar Cliente");
			System.out.println("2. Cadastrar Produto");
			System.out.println("3. Registrar NFe");
			System.out.println("4. Ver Nota Fiscal");
			System.out.println("5. Sair");
			
			op = ler.nextInt();
			
			switch (op) {
			
			case 1:
				System.out.println("===Cadastro de Cliente===");
				System.out.println("Digite codigo Cliente:");
				clil.codigo_cliente = ler.next();
				System.out.println("Digite Nome Cliente:");
				clil.nome_cliente = ler.next();
				System.out.println("Digite Endereço do Cliente:");
				clil.endereco_cliente = ler.next();
				break;
			case 2:
				System.out.println("===Cadastro de Produto===");
				System.out.println("Digite codigo Produto:");
				prod1.codigo_produto = ler.next();
				System.out.println("Digite Nome Produto:");
				prod1.nome_produto = ler.next();
				break;
			case 3:
				System.out.println("==Cadastro de NFe==");
				System.out.println("Digite numero da NFe:");
				NFe.numero_NFe = ler.next();
				System.out.println("Digite a Data da NFe:");
				NFe.data_NFe = ler.next();
				NFe.clientedanota = clil;
				
				System.out.println("==Detalhe de NFe==");
				detalheNFe.nfiscalE = NFe;
				detalheNFe.produto1 = prod1;
				System.out.println("Para: " + prod1.codigo_produto + " " + prod1.nome_produto + " ");
				System.out.println("Digite quantidade: ");
				detalheNFe.quantidade = ler.nextInt();
				System.out.println("Digite preco unitario: ");
				detalheNFe.preco_unitario = ler.nextInt();
				break;
			case 4:
				System.out.println("=== NFe ===");
				System.out.println("Numero: " + NFe.numero_NFe);
				System.out.println("Data: "+ NFe.data_NFe);
				System.out.println("Cliente codigo: "+ NFe.clientedanota.codigo_cliente);
				System.out.println("Cliente nome: " + NFe.clientedanota.nome_cliente);
				System.out.println("Cliente endereço: " + NFe.clientedanota.endereco_cliente);
				System.out.println("=== = ===");
				System.out.println(detalheNFe.produto1.codigo_produto + " " + detalheNFe.produto1.nome_produto);
			}		
			
		} while (op != 5);	
		
		ler.close();
	}

}
