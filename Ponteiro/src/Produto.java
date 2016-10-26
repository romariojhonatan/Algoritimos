
public class Produto {

	private String nome;
	private String descricao;
	private Double valor;
	
	public Produto(String nome, String descricao, Double valor) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
