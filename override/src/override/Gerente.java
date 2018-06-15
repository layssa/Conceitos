package override;

public class Gerente extends Funcionario {
	protected double gratificacao;
	
	public Gerente () {
	}
	
	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}

	@Override
	public void apresentarFuncionario() {
	}
	
	@Override
	public void calcularSalarioFinal(double ValorVendido) {
	}

}
