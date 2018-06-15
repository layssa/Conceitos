package overload;

public class Livro extends Produto {
	private String Autor;
	private String Editora;
	private String Edicao;
	
	public Livro () {
	}
	
	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getEditora() {
		return Editora;
	}

	public void setEditora(String editora) {
		Editora = editora;
	}

	public String getEdicao() {
		return Edicao;
	}

	public void setEdicao(String edicao) {
		Edicao = edicao;
	}

	public void calcularPrecoVenda(boolean didatico) { }
	
	public void inserirDadosLivro() { }
	
	public void apresentarLivro() { }

}
