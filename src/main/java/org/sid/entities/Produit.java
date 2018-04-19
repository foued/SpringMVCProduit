package org.sid.entities;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Produit implements Serializable{ 
	
	@Id
	@GeneratedValue
	private int idproduit;
	private String designation;
	private double prix;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Produit() {
	
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Produit [idproduit=" + idproduit + ", designation=" + designation + ", prix=" + prix + "]";
	}
	public Produit(String designation, double prix) {
		this.designation = designation;
		this.prix = prix;
	}
	

}
