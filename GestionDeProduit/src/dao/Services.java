package dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.util.*;

//import antlr.collections.List ;
import util.HibernateUtil;

import util.*;
import java.util.List;
import java.awt.*;

public class Services {

	public void addProduit(Produit p) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();

	}

	public Produit getProduit(Long idP) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p = (Produit) session.load(Produit.class, idP);
		return p;

	}

	public List<Produit> getAllProduits() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		//requete HQP (pas SQL) Hibernate Query language
		return session.createQuery("from Produit").list();
	}

	public void addCategorie(Categorie c) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();

	}

	public Categorie getCategorie(Long idC) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Categorie p = (Categorie) session.load(Categorie.class, idC);
		return p;

	}

	public void addProduitToCategorie(Long idP, Long idC) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p = (Produit) session.load(Produit.class, idP);
		Categorie c = (Categorie) session.load(Categorie.class, idC);
		c.getProduits().add(p);
		session.getTransaction().commit();

	}

	public List<Categorie> getAllCategorie() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		return session.createQuery("from Categorie").list();
	}

	

}
