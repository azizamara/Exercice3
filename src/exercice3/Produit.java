package exercice3;

public class Produit {

	private String reference;
	protected float prix; 
	private int stock ;
	
	public  Produit(String ref ,float p ,int s) {
		this.reference=ref ; 
		this.prix=p ; 
		this.stock=s ;
		
	}
	
	public String toString() {
		return "Produit :  "+reference+" prix: "+prix+" stock: "+stock ; 
	}
	

	
	public void diminuerStock(int i) {
		stock-=i ; 
	}
	public float reduction() {}
	
	public String getReference() {
		return reference;
	}
	public void setReference(String ref) {
		this.reference = ref;
	}
	
	public float getPrix() {
		return prix;
	}
	public void setPrix(float p) {
		this.prix = p;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int s) {
		this.stock = s;
	}
	public void verifStock(int nb) throws NbProdNegException {
		if(nb<0) {
			throw new NbProdNegException() ; 
		}
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
