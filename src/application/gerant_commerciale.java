package application;

public class gerant_commerciale {
	private int id;
	private String nom;
	private String prenom;
	private double salaire;
	public gerant_commerciale(int id, String nom, String prenom, double salaire) {
		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setSalaire(double salaire) {
		this.salaire=salaire;
	}
    public double getSalaire() {
    	return this.salaire;
    }
    @Override
    public String toString() {
		super.toString();
    	return "salaire gerant:"+this.salaire+"  ";
    	
    }


}

