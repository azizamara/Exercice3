package exercice3;

import ex.Client;
import ex.Comparable;

public class Client implements Comparable {

	private String nom,adresse;
	private int credits;
	
	public Client( String n, String a,int c  ) {nom = n; adresse = a; credits = c;}
	public Client(String n){nom = n;}	
	public String toString() {return ("nom: "+nom + "  adresse: "+adresse + "  credits= "+credits);}
	public void augmenterCredit(float n) {credits+=n;}
	public int CompareTo(Client c) {
		return this.nom.compareTo(c.nom);
	}
	
	
	public static void main(String[] args) {
		Client c = new Client("aziz","sousse",150);
		Client c1 = new Client("aziz");
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c.CompareTo(c1));
	}
}

	
 