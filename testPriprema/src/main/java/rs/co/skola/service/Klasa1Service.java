package rs.co.skola.service;

import java.util.List;

import rs.co.skola.model.Klasa1Model;

public interface Klasa1Service {
	List<Klasa1Model> listaKlasa1();
	
	Klasa1Model saveKlasa1(Klasa1Model klasa1);
	
	Klasa1Model returnKlasa1(Long id);
	
	Klasa1Model updateKlasa1(Long id, Klasa1Model klasa1);
	
	void deleteKlasa1(Long id);
}
