package application;

public class rayon {
	private int id_rayon;
    private String categorie;
    public int nb_etage;
    public rayon(int id_rayon,String categorie,int nb_etage) {
    	this.nb_etage= nb_etage;
    	this.id_rayon=id_rayon;
    	this.categorie=categorie;
    }
	@Override
	public String toString() {
		return "rayon [id_rayon=" + id_rayon + ", categorie=" + categorie + ", nb_etage=" + nb_etage + "]";
	}
	public int getId_rayon() {
		return id_rayon;
	}
	public void setId_rayon(int id_rayon) {
		this.id_rayon = id_rayon;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getNb_etage() {
		return nb_etage;
	}
	public void setNb_etage(int nb_etage) {
		this.nb_etage = nb_etage;
	}
	

}
