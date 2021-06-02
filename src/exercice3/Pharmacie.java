package exercice3;

public class Pharmacie {

	private String nom , adresse ;
	private Client [] TabClients ; 
	private Produit[] TabProduits ; 
	
 	public Pharmacie(String n ,String adr){
 		this.adresse=adr; 
 		this.nom=n ; 
 	}

	public void afficherClients() {
		for(int i=0;i<TabClients.length;i++) {
			System.out.println(TabClients[i].toString());
		}
	}
	
	
	public void achat(Client c,float s ,Produit p, int nbr) 
	{
		try {
		for(int i=0;i<TabProduits.length;i++) {
			if(TabProduits[i]==p ) {
				TabProduits[i].verifStock(nbr);
				TabProduits[i].diminuerStock(nbr);
					break ; 
				}

			}
		
		for(int i=0;i<TabClients.length;i++) {
			if(TabClients[i]==c ) {
				
				TabClients[i].augmenterCredit(p.reduction()-s);
		    break ; 
	}
		}
		
		
	}
	
	catch(NbProdNegException e) {
		System.out.println("Pas possible de reserver une quantite negative !");}
	
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
