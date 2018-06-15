package override;

public class Temporario extends Funcionario {
	protected boolean comissionado;
	
	public Temporario () {
	}
	
	public boolean isComissionado() {
		return comissionado;
	}

	public void setComissionado(boolean comissionado) {
		this.comissionado = comissionado;
	}

	@Override
	public void inserirDadosFuncionario() {
	}
	
	@Override
	public void apresentarFuncionario() {
	}
	
	@Override
	public void calcularSalarioFinal(double ValorVendido) {
		
	}
}
