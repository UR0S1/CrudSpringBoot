package rs.co.skola.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="klasa1")
public class Klasa1Model implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="ime", columnDefinition="VARCHAR(20)", nullable=false)
	private String ime;
	
	
	
	public Klasa1Model(Long id, String ime) {
		super();
		this.id = id;
		this.ime = ime;
	}

	
	public Klasa1Model() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}


	public void updateKlasa1(Klasa1Model klasa1) {
		this.ime = klasa1.getIme();
	}

}
