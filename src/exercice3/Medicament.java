package exercice3;

public class Medicament extends Produit {

private Boolean generique, ordonnance; 
	
	public  Medicament(String ref ,float p ,int s,Boolean g, Boolean o) {
		super(ref,p,s);
		this.generique=g ;
		this.ordonnance=o ; 
	}
	public float reduction() {
		if(generique ==true) {
			return prix*0.05 ;
		}
		return prix; 
	}

	public Boolean getGen() {
		return generique;
	}

	public void setGen(Boolean g) {
		this.generique = g;
	}

	public Boolean getOrdo() {
		return ordonnance;
	}

	public void setOrdo(Boolean ordo) {
		this.ordonnance = ordo;
	}
	
	public String toString() {
		return super.toString()+generique +" generique: " + ordonnance+"ordonnace " ;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
