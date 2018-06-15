package heranca;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa {
	protected double limiteCredito, rendaMensal;
	protected String rg, cpf; 	

	public Cliente(){
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public double getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void inserirDadosCliente () {
		limiteCredito = Double.parseDouble (javax.swing.JOptionPane.showInputDialog("Digite o limite de crédito:"));
		rendaMensal = Double.parseDouble (javax.swing.JOptionPane.showInputDialog("Digite a renda mensal:"));
		rg = (javax.swing.JOptionPane.showInputDialog("Digite o RG:"));
		cpf = (javax.swing.JOptionPane.showInputDialog("Digite o CPF:"));
		
		this.apresentarCliente();
	}
	
	public void apresentarCliente() {
		JOptionPane.showMessageDialog (null, "Limite de crédito: " +getLimiteCredito()+
				"\nRenda Mensal: " +getRendaMensal()+
				"\nRG: " +getRg()+
				"\nCPF: " +getCpf(), "Cliente", JOptionPane.INFORMATION_MESSAGE);
		
		this.inserirDadosPessoa();
	}
}
