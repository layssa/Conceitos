package heranca;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	
	protected double salarioBase, salarioFinal; 	

	public Funcionario(){
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	
	public void inserirDadosFuncionario  () {
		salarioBase = Double.parseDouble (javax.swing.JOptionPane.showInputDialog("Digite o CNPJ:"));
		salarioFinal = Double.parseDouble (javax.swing.JOptionPane.showInputDialog("Digite o contato:"));
		
		this.apresentarFuncionario ();
	}
	
	public void apresentarFuncionario () {
		JOptionPane.showMessageDialog (null, "Salário Base: " +getSalarioBase()+
				"\nSalário Final: " +getSalarioFinal(), "Funcionario", JOptionPane.INFORMATION_MESSAGE);
		
		this.inserirDadosPessoa();
	}
}
