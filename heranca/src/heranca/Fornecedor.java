package heranca;

import javax.swing.JOptionPane;

public class Fornecedor extends Pessoa {
	
	protected String cnpj, ie, contato; 	

	public Fornecedor(){
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public void inserirDadosFornecedor () {
		cnpj = (javax.swing.JOptionPane.showInputDialog("Digite o CNPJ:"));
		ie = (javax.swing.JOptionPane.showInputDialog("Digite o IE:"));
		contato = (javax.swing.JOptionPane.showInputDialog("Digite o contato:"));
		
		this.apresentarFornecedor();
	}
	
	public void apresentarFornecedor() {
		JOptionPane.showMessageDialog (null, "CNPJ: " +getCnpj()+
				"\nIE: " +getIe()+
				"\nContato: " +getContato(), "Fornecedor", JOptionPane.INFORMATION_MESSAGE);
		
		this.inserirDadosPessoa();
	}

}
