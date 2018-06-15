package override;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	private double salarioBase;
	private double salarioFinal;
	
	public Funcionario () {
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

	public void inserirDadosFuncionario() {
		salarioBase= Double.parseDouble (javax.swing.JOptionPane.showInputDialog("Digite o salário base:"));
		salarioFinal= Double.parseDouble (javax.swing.JOptionPane.showInputDialog("Digite o salário final:"));
	}

	public void apresentarFuncionario() {
		JOptionPane.showMessageDialog (null, "Salário base: " +getSalarioBase()+ 
				"\nSalário Final: " +getSalarioFinal(), "Funcionario", JOptionPane.INFORMATION_MESSAGE);
		
		this.inserirDadosPessoa();
	}
	
	public void calcularSalarioFinal(double ValorVendido) {
		
	}

}

