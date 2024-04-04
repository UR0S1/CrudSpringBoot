package rs.co.skola.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="klasa3")
public class Klasa3Model implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="id_klasa1", columnDefinition="BIGINT", nullable=false)
	private Long id_klasa1;
	
	@Column(name="id_klasa2", columnDefinition="BIGINT", nullable=false)
	private Long id_klasa2;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumns({	
		@JoinColumn(name = "id_klasa1", referencedColumnName = "id", nullable = false, updatable = false, insertable = false)
	})
	private Klasa1Model klasa1_klasa3Model;

	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumns({
		@JoinColumn(name = "id_klasa2", referencedColumnName = "id", nullable = false, updatable = false, insertable = false)		
	})
	private Klasa2Model klasa2_klasa3Model;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getId_klasa1() {
		return id_klasa1;
	}


	public void setId_klasa1(Long id_klasa1) {
		this.id_klasa1 = id_klasa1;
	}


	public Long getId_klasa2() {
		return id_klasa2;
	}


	public void setId_klasa2(Long id_klasa2) {
		this.id_klasa2 = id_klasa2;
	}


	public Klasa1Model getKlasa1_klasa3Model() {
		return klasa1_klasa3Model;
	}


	public void setKlasa1_klasa3Model(Klasa1Model klasa1_klasa3Model) {
		this.klasa1_klasa3Model = klasa1_klasa3Model;
	}


	public Klasa2Model getKlasa2_klasa3Model() {
		return klasa2_klasa3Model;
	}


	public void setKlasa2_klasa3Model(Klasa2Model klasa2_klasa3Model) {
		this.klasa2_klasa3Model = klasa2_klasa3Model;
	}


	public Klasa3Model(Long id, Long id_klasa1, Long id_klasa2) {
		super();
		this.id = id;
		this.id_klasa1 = id_klasa1;
		this.id_klasa2 = id_klasa2;
	}


	public Klasa3Model() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void updateKlasa3(Klasa3Model klasa3) {
		this.id_klasa1 = klasa3.getId_klasa1();
		this.id_klasa2 = klasa3.getId_klasa2();
	}
	
	
	
	
	
}
