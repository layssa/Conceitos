package override;

import javax.swing.JOptionPane;

public class Vendedor extends Funcionario {
	protected double valorComissao;
	
	public Vendedor () {
	}
	
	public double getValorComissao() {
		return valorComissao;
	}

	public void setValorComissao(double valorComissao) {
		this.valorComissao = valorComissao;
	}

	public void apresentarFuncionario() {
		JOptionPane.showMessageDialog (null, "Salário base: " +getSalarioBase()+ 
				"\nSalário Final: " +getSalarioFinal(), "Funcionario", JOptionPane.INFORMATION_MESSAGE);
		
		this.inserirDadosPessoa();
	}
}
