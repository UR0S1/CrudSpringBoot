package rs.co.skola.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="klasa2")
public class Klasa2Model implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="naziv", columnDefinition="VARCHAR(20)", nullable=false)
	private String naziv;

	
	public Klasa2Model() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Klasa2Model(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void updateKlasa2(Klasa2Model klasa2) {
		this.naziv = klasa2.getNaziv();		
	}
	
	
}
