package override;

public class Principal {

	public static void main(String[] args) {
		int opcao;
		
		opcao = Integer.parseInt (javax.swing.JOptionPane.showInputDialog("Selecione uma opção"
				+"\n 1 - Temporario"
				+"\n 2 - Vendedor"
				+"\n 3 - Gerente"));
		
		switch(opcao){
		case 1:
		Temporario tem = new Temporario();
		tem.inserirDadosFuncionario();
		break;
		
		case 2:
		Vendedor ven = new Vendedor();
		ven.inserirDadosFuncionario();
		break;
		
		case 3:
		Gerente ger = new Gerente();
		ger.inserirDadosFuncionario();
		break;
		}
	}

}
