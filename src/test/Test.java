package test;
import ristorante.CordBancarie;
import ristorante.Persona;
import ristorante.Ristorante;
public class Test {

	public static void main(String[] args) {
		Ristorante rist=new Ristorante();
		rist.creaIndirizzo("Via Roma", 8, "Milano");
		String via=rist.via();
		System.out.println("via: "+via);
		String citta=rist.citta();
		System.out.println(citta);
		
		rist.creaDipendenti(10);
		Persona primo_dipendente=new Persona("Anna", "Pullace");
		rist.assume(0, primo_dipendente);
		CordBancarie cord_dip_0=rist.cordBancarie(0);
		
		String iban_primo_assunto=rist.iban(0);
		System.out.println("iban 0: "+iban_primo_assunto);
		
		rist.creaTavoli(5);
		rist.creaTavolo(200);
		rist.creaTavolo(201);
		rist.creaTavolo(202);

		
		
		
		
		
		
		
		
		

		


		
		
		

	}

}
