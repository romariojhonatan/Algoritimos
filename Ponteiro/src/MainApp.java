import java.util.Date;

public class MainApp {
	public static void main(String[] args) {
		
		Cliente c = new Cliente("Romário", "110.428.087.62", "CTIS");
		System.out.println(c.getNome());
		System.out.println(c.getCpf());
		System.out.println(c.getEmpresa());
	
		System.out.println("");
		
		Funcionario f = new Funcionario("Romário", new Date(), "Operador");
		System.out.println(f.getNome());
		System.out.println(f.getDataNascimento());
		System.out.println(f.getCargo());
		
		System.out.println("");
		
		Produto p = new Produto("Celular", "Zefone2", 950.00);
		System.out.println(p.getNome());
		System.out.println(p.getDescricao());
		System.out.println(p.getValor());
	}
}
