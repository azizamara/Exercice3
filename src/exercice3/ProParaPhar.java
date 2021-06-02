package exercice3;

public class ProParaPhar extends Produit {


		private String type ; 
		
		public ProParaPhar(String ref ,float p ,int s,String t) {
			super(ref,p,s);
			this.type=t;
			
		}
		public float reduction() {
			if(type =="cosmétique") {
				return prix *0.08 ;
			}
			return prix; 
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		public String toString() {
			return super.toString()+" type: " +type;
		}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
