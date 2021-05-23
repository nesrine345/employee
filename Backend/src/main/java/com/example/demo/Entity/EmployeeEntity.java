package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Employeur")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Prenom")
	private String Prenom;
	@Column(name = "adress")
	private String adress;
	@Column(name = "Salaire")
	private double Salaire;

    @Column(name="email")
	private String email;



	public EmployeeEntity(Integer id, String name, String prenom, String adress, double salaire, String email) {
		super();
		this.id = id;
		Name = name;
		Prenom = prenom;
		this.adress = adress;
		Salaire = salaire;
		this.email = email;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public Integer getId() {
		return id;
	}

	public double getSalaire() {
		return Salaire;
	}

	public void setSalaire(double salaire) {
		Salaire = salaire;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Prenom == null) ? 0 : Prenom.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Salaire);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEntity other = (EmployeeEntity) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Prenom == null) {
			if (other.Prenom != null)
				return false;
		} else if (!Prenom.equals(other.Prenom))
			return false;
		if (Double.doubleToLongBits(Salaire) != Double.doubleToLongBits(other.Salaire))
			return false;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", Name=" + Name + ", Prenom=" + Prenom + ", adress=" + adress
				+ ", Salaire=" + Salaire + ", email=" + email + "]";
	}


}
