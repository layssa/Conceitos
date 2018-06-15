package overload;

public class Produto {
	private int Codigo;
	private String Descricao;
	private String Genero;
	private int EstoqueDisponivel;
	private double precoCusto;
	private double precoVenda;
	
	public Produto () {
	}
	
	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public int getEstoqueDisponivel() {
		return EstoqueDisponivel;
	}

	public void setEstoqueDisponivel(int estoqueDisponivel) {
		EstoqueDisponivel = estoqueDisponivel;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public void calcularPrecoVenda() { }
	
	public void calcularPrecoVenda(double cotacaodolar) { }
	
	public void calcularPrecoVenda(String Genero) { }
}
