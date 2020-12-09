package ristorante;

public class Ristorante {
	private String nome;
	private Indirizzo indirizzo;
	private Persona[] dipendenti;
	private Persona manager;
	private Tavolo[] tavoli;
	private int conta_tavoli;

	public Ristorante() {
		conta_tavoli = 0;
	}

	public String via() {
		return indirizzo.getVia();
	}

	public String citta() {
		return indirizzo.getCitta();
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void creaIndirizzo(String via, int civico, String citta) {
		indirizzo = new Indirizzo(via, civico, citta);
	}

	public void creaDipendenti(int numero_dipendenti) {
		dipendenti = new Persona[numero_dipendenti];
	}

	public CordBancarie cordBancarie(int dipendente) { // noccapito
		return dipendenti[dipendente].getCoordinate();
	}

	public String iban(int dipendente) { // noccapito
		return cordBancarie(dipendente).getIban();
	}

	public void assume(int index, Persona dipendente) {
		dipendenti[index] = dipendente;
	}

	public void creaTavoli(int numero_tavoli) {
		tavoli = new Tavolo[numero_tavoli];
	}

	public void creaTavolo(int numero_tavolo) { //noccapito
		tavoli[conta_tavoli] = new Tavolo(numero_tavolo);
		conta_tavoli=conta_tavoli+1;
	}

}
