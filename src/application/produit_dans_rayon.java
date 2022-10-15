package application;

public class produit_dans_rayon {
	private int ref;
	private String nom_produit;
	private String categorie;
	private String marque;
	private double prix;
	private int num_rayon;

	public produit_dans_rayon(int ref,String nom_produit,String marque,String categorie,double prix,int num_rayon) {
		this.ref=ref;
		this.nom_produit=nom_produit;
		this.marque=marque;
		this.prix=prix;
		this.num_rayon=num_rayon;
		this.categorie=categorie;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getNum_rayon() {
		return num_rayon;
	}
	public void setNum_rayon(int num_rayon) {
		this.num_rayon = num_rayon;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public void setRef(int n) {ref=n;}
	public int getRef() {
		return this.ref;
	}
	public void setNom_produit(String nom) {nom_produit=nom;}
	public String getNom_produit() {
		return this.nom_produit;
	}
	public void setPrix(double m) {prix=m;}
	public double getPrix() {
		return this.prix;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	@Override
    public String toString() {
    	return "ref:"+this.ref+"    "+"nom_produit:"+this.nom_produit+"marque:"+this.marque+"   "+"prix:"+this.prix+"   "+"num_rayon:"+this.num_rayon;
    	
    }
	
	

}



