package dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


//@table("table") c'est une annotation java ( Hibernate ) qui a pour but de remplacer les fichier xml
public class Categorie {

	// Les parametres
	// L'id avec les framework dois etre de type Classe comme exemple Long et pas long
	//@..("y") c'est une annotation java ( Hibernate ) pour identifier le correspondant champ de base de donnée
	private Long idCategorie ;
	private String titre ;
	private String description ;
	private Date dateAjout ;
	private Set<Produit> produits = new HashSet<Produit>();
			
	//constructeur	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Categorie(String titre, String description, Date dateAjout) {
		super();
		this.titre = titre;
		this.description = description;
		dateAjout = dateAjout;
	}

	//getters & setters
	
	
	public Long getIdCategorie() {
		return idCategorie;
	}
	

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
	public Set<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		dateAjout = dateAjout;
	}

	public void show(){
		System.out.println(this.titre+"--"+this.description+"--"+this.dateAjout);
	}

	
	
	
}
