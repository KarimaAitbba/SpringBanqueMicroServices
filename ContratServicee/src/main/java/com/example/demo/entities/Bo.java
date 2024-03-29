package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@JsonIdentityInfo(
generator = ObjectIdGenerators.PropertyGenerator.class,
property = "id")
public class Bo extends User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String CIN; //sera l id
    private String nom;
    private String Prenom;
    private int NumTel;
    
    @JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_agence", nullable=false)//colonne de agnece
    private Agence agence;
    
	@JsonBackReference
    @OneToMany(mappedBy="bo", fetch=FetchType.LAZY)
    private List<Contrat> Contrat;

    @JsonBackReference
    @OneToMany(mappedBy="bo", fetch=FetchType.LAZY)
    private List<Offre> Offre;

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public int getNumTel() {
		return NumTel;
	}

	public void setNumTel(int numTel) {
		NumTel = numTel;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public List<Contrat> getContrat() {
		return Contrat;
	}

	public void setContrat(List<Contrat> contrat) {
		Contrat = contrat;
	}

	public Bo(String cIN, String nom, String prenom, int numTel, Agence agence,
			List<Contrat> contrat) {
		super();
		CIN = cIN;
		this.nom = nom;
		Prenom = prenom;
		NumTel = numTel;
		this.agence = agence;
		Contrat = contrat;
	}

	public Bo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    

}
