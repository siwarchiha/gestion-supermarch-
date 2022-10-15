package application;

public class caissier {
	private int num_caisse;
	private int id;
	private String nom;
	private String prenom;
	private double salaire;
    public caissier(int id, String nom, String prenom, double salaire,int num_caisse) {
		this.num_caisse = num_caisse;
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	public int getNum_caisse() {
		return num_caisse;
	}
	public void setNum_caisse(int num_caisse) {
		this.num_caisse = num_caisse;
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
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	@Override
    public String toString() {
		super.toString();
		return "id:"+this.id+"  "+"nom :"+this.nom+"    "+"prenom:"+this.prenom+"salaire caissier:"+this.salaire+"  "+"num caisse:"+this.num_caisse+" ";
    	
    	
    }
	public int getId() {
		return this.id;
	}

}
