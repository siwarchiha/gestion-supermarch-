package application;

import java.util.ArrayList;

public class commande {
	private int id;
	int ref_produit;
	float total;
	int qtecom;
	String nom_produit;
	//ArrayList<produit_commandé> tab_produit_commandé = new ArrayList();
	public commande (int id,String nom_produit,int ref_produit,int qtecom,float total) {
		this.id=id;
		this.ref_produit=ref_produit;
		this.total=total;
		this.qtecom=qtecom;
		this.nom_produit=nom_produit;
		}
	public void setId(int n) {id=n;}
	public int getId() {
		return this.id;
	}
	public void setId_produit(int n) {ref_produit=n;}
	public int getId_produit() {
		return this.ref_produit;
	}
	public void setTotal(float m) {total=m;}
	public float getTotal() {
		return this.total;
	}
	public void setQtecom(int n) {qtecom=n;}
	public int getQtecom() {
		return this.qtecom;
	}
	public void setNom_produit(String nom) {nom_produit=nom;}
	public String getNom_produit() {
		return this.nom_produit;
	}
	@Override
    public String toString() {
    	return "id:"+this.id+"  "+"ref_produit:"+this.ref_produit+"    "+"nom_produit:"+this.nom_produit+"qtecom"+this.qtecom+"   "+"total:"+this.total;
    	
    }
	

}
