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
		JOptionPane.showMessageDialog (null, "Sal�rio base: " +getSalarioBase()+ 
				"\nSal�rio Final: " +getSalarioFinal(), "Funcionario", JOptionPane.INFORMATION_MESSAGE);
		
		this.inserirDadosPessoa();
	}
}
