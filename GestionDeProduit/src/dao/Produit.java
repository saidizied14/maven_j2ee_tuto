package dao;


public class Produit {
// Les parametres
// L'id avec les framework dois etre de type Classe comme exemple Long et pas long
private Long idProduit ;
private String nom ;
private String description ;
private Double prix ;

//constructeur
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}

public Produit(String nom, String description, Double prix) {
	super();
	this.nom = nom;
	this.description = description;
	this.prix = prix;
}
//getters setters

public String getNom() {
	return nom;
}
public Long getIdProduit() {
	return idProduit;
}

public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}

public void setNom(String nom) {
	this.nom = nom;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Double getPrix() {
	return prix;
}
public void setPrix(Double prix) {
	this.prix = prix;
}

public void show(){
	System.out.println(this.nom+"--"+this.description+"--"+this.prix);
}

}
