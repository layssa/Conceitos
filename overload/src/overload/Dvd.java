package overload;

public class Dvd extends Produto {
		private String Diretor;
		private String Duracao;
		private int censura;
		
		public Dvd () {
		}
		
		public String getDiretor() {
			return Diretor;
		}

		public void setDiretor(String diretor) {
			Diretor = diretor;
		}

		public String getDuracao() {
			return Duracao;
		}

		public void setDuracao(String duracao) {
			Duracao = duracao;
		}

		public int getCensura() {
			return censura;
		}

		public void setCensura(int censura) {
			this.censura = censura;
		}

		public void inserirDadosDvd() { }
		
		public void apresentarDvd() { }
}
