package application;

public class Personne {
	private int id;
	private String nom;
	private String prenom;
    public Personne(int id, String nom,String prenom) {
    	this.nom=nom;
    	this.prenom=prenom;
    	this.id=id;
    	
	}
    public void setid(int id) {
    	this.id=id;
	}
    public int getid() {
		return this.id;
	}
    public void setnom(String nom) {
    this.nom=nom;
    	
    };
    public String getnom() {
    	return this.nom; 
    }
    public void setprenom(String prenom) {
    	this.prenom=prenom;
    }
    public String getprenom() {
    	return this.prenom;
    }
    @Override
    public String toString() {
    	return "id:"+this.id+"  "+"nom :"+this.nom+"    "+"prenom:"+this.prenom;
    	
    }

}
