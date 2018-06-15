package override;

import javax.swing.JOptionPane;

public class Pessoa {
	protected int codigo;
	protected String nome, endereco, bairro, cidade, uf, telefone, celular; 	

	public Pessoa(){
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void inserirDadosPessoa () {
		codigo = Integer.parseInt (javax.swing.JOptionPane.showInputDialog("Digite o código:"));
		nome = (javax.swing.JOptionPane.showInputDialog("Digite o nome:"));
		endereco = (javax.swing.JOptionPane.showInputDialog("Digite o endereço:"));
		bairro = (javax.swing.JOptionPane.showInputDialog("Digite o bairro:"));
		cidade = (javax.swing.JOptionPane.showInputDialog("Digite a cidade:"));
		uf = (javax.swing.JOptionPane.showInputDialog("Digite o UF:"));
		telefone = (javax.swing.JOptionPane.showInputDialog("Digite o telefone:"));
		celular = (javax.swing.JOptionPane.showInputDialog("Digite o celular:"));
		
		this.apresentarPessoa();
	}
	
	public void apresentarPessoa() {
		JOptionPane.showMessageDialog (null, "Código: " +getCodigo()+
				"\nNome: " +getNome()+
				"\nEndereço: " +getEndereco()+
				"\nBairro: " +getBairro()+
				"\nCidade: " +getCidade()+
				"\nUF: " +getUf()+
				"\nTelefone: " +getTelefone()+
				"\nCelular: " +getCelular(), "Pessoa", JOptionPane.INFORMATION_MESSAGE);
		
		this.mostrarTelefones();
	}
	
	public void mostrarTelefones(){
		JOptionPane.showMessageDialog (null, "Telefone: " +getTelefone());
	}
		
}





