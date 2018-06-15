package overload;

public class Principal {
	
	public static void main(String[] args) {
		int opcao;
		
		opcao = Integer.parseInt (javax.swing.JOptionPane.showInputDialog("Selecione uma opção"
				+"\n 1 - DVD"
				+"\n 2 - CD"
				+"\n 3 - Livro"));
		
		switch(opcao){
		case 1:
		Dvd dvd = new Dvd();
		dvd.inserirDadosDvd();
		break;
		
		case 2:
		Cd cd = new Cd();
		cd.inserirDadosCd();
		break;
		
		case 3:
		Livro liv = new Livro();
		liv.inserirDadosLivro();
		break;
		}
	}
}