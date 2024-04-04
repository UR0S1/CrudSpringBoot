package rs.co.skola.service;

import java.util.List;

import rs.co.skola.model.Klasa2Model;

public interface Klasa2Service {
	List<Klasa2Model> listaKlasa2();
	
	Klasa2Model saveKlasa2(Klasa2Model klasa2);
	
	Klasa2Model returnKlasa2(Long id);
	
	Klasa2Model updateKlasa2(Long id, Klasa2Model klasa2);
	
	void deleteKlasa2(Long id);
}
