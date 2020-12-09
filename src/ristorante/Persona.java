package ristorante;

public class Persona {
	private String nome;
	private String cognome;
	private CordBancarie coordinate;
	private double salario;

	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public CordBancarie getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(CordBancarie coordinate) {
		this.coordinate = coordinate;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	




}
