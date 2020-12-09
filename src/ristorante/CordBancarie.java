package ristorante;

public class CordBancarie {
	
	private String nomeBanca;
	int counter;
	private String iban="IT0000"+counter;
	
	public CordBancarie(String nomeBanca) {
		this.nomeBanca = nomeBanca;
		counter++;
	}
	public String getIban() {
		return iban;
	}
	

}
