import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import dao.*;
public class Test {

	public static void main(String[] args) throws ParseException {
		//load services
		Services s = new Services();
		// les produit
		Produit p1 = new Produit("nom1", "description1",  (double) 700);
		Produit p2 = new Produit("nom2", "description2",  (double) 800);
		Produit p3 = new Produit("nom3", "description3",  (double) 900);
		Produit p4 = new Produit("nom4", "description4",  (double) 600);
		Produit p5 = new Produit("nom5", "description5",  (double) 500);
	
		s.addProduit(p1);
		s.addProduit(p2);
		s.addProduit(p3);
		s.addProduit(p4);
		s.addProduit(p5);
		
//		
//		java.util.Date dt = new java.util.Date();
//		java.text.SimpleDateFormat sdf = 
//		new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String currentTime = sdf.format(dt);
//		
//		System.out.println("zied"+  currentTime);
//	
	
		
		Categorie c1 = new Categorie("titre1", "description1", new Date()) ;
		Categorie c2 = new Categorie("titre2", "description2", new Date()) ;
		Categorie c3 = new Categorie("titre3", "description3", new Date()) ;
		Categorie c4 = new Categorie("titre4", "description4", new Date()) ;
		Categorie c5 = new Categorie("titre5", "description5", new Date()) ;
				
		s.addCategorie(c1);
		s.addCategorie(c2);
		s.addCategorie(c3);
		s.addCategorie(c4);
		s.addCategorie(c5);
		
		//get
		
		Categorie cat = s.getCategorie(new Long(3));
		cat.show();
		
		Produit prod = s.getProduit(new Long(3));
		prod.show();
		
		//List
		List<Produit> produits =   s.getAllProduits() ;
		System.out.println("La liste des produit :");
		int i=0 ;
		while ( produits.size()>i){
			Produit produit = produits.get(i);
			produit.show();
			i++;
			
		}
		
		
		//affectation
		
		
		
		
		
		
		
	}

	
	
}




















