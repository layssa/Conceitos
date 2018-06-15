package overload;

public class Cd extends Produto {
	private String Artista;
	private String Gravadora;
	private String paisOrigem;
	
	public Cd () {
	}
	
	public String getArtista() {
		return Artista;
	}

	public void setArtista(String artista) {
		Artista = artista;
	}

	public String getGravadora() {
		return Gravadora;
	}

	public void setGravadora(String gravadora) {
		Gravadora = gravadora;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public void inserirDadosCd() { }
	
	public void apresentarCd() { }

}
