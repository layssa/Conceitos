package heranca;

public class Principal {

	public static void main(String[] args) {
int opcao;
		
		opcao = Integer.parseInt (javax.swing.JOptionPane.showInputDialog("Selecione uma opção"
				+"\n 1 - Funcionario"
				+"\n 2 - Fornecedor"
				+"\n 3 - Cliente"));
		
		switch(opcao){
		case 1:
		Funcionario fun = new Funcionario();
		fun.inserirDadosFuncionario();
		break;
		
		case 2:
		Fornecedor fon = new Fornecedor();
		fon.inserirDadosFornecedor();
		break;
		
		case 3:
		Cliente cli = new Cliente();
		cli.inserirDadosCliente();
		break;
		}

	}

}
