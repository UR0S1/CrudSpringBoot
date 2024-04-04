package rs.co.skola.service;

import java.util.List;

import rs.co.skola.model.Klasa3Model;

public interface Klasa3Service {
	List<Klasa3Model> listaKlasa3();
	
	Klasa3Model saveKlasa3(Klasa3Model klasa3);
	
	Klasa3Model returnKlasa3(Long id);
	
	Klasa3Model updateKlasa3(Long id, Klasa3Model klasa3);
	
	void deleteKlasa3(Long id);
}
