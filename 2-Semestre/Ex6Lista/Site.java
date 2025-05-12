package Ex6Lista;

public class Site {

	private String nome;
	private String enderecoIP;
	private boolean status;

	public Site(String nome, String enderecoIP, boolean status) {
		setNome(nome);
		setEnderecoIP(enderecoIP);
		setStatus(status);
	}

	public String getEnderecoIP() {
		return enderecoIP;
	}

	public String getNome() {
		return nome;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setEnderecoIP(String enderecoIP) throws IllegalArgumentException {
		if (enderecoIP == null || enderecoIP.trim().equals("")) {
			throw new IllegalArgumentException();
		}
		
		this.enderecoIP = enderecoIP;
	}
	
	public void setNome(String nome) throws IllegalArgumentException {
		if (nome == null || nome.trim().equals("")) {
			throw new IllegalArgumentException();
		}
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		String impressao = "Site: " + getNome() + "\nIP: " + getEnderecoIP() +"\nAcesso: ";
		if (isStatus()) { //if (isStatus() == true) {
			impressao += "Permitido";
		} else {
			impressao += "Bloqueado";
		}
		return impressao;
	}
	
}
