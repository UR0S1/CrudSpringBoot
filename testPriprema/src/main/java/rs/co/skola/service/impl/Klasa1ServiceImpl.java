package rs.co.skola.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import rs.co.skola.model.Klasa1Model;
import rs.co.skola.repository.Klasa1Repository;
import rs.co.skola.service.Klasa1Service;

@Service
public class Klasa1ServiceImpl implements Klasa1Service{

	Klasa1Repository klasa1Repository;
	
	
	public Klasa1ServiceImpl(Klasa1Repository klasa1Repository) {
		super();
		this.klasa1Repository = klasa1Repository;
	}

	@Override
	public List<Klasa1Model> listaKlasa1() {
		return klasa1Repository.findAll();
	}

	@Override
	public Klasa1Model saveKlasa1(Klasa1Model klasa1) {
		return klasa1Repository.save(klasa1);
	}

	@Override
	public Klasa1Model returnKlasa1(Long id) {
		return klasa1Repository.findById(id).get();
	}

	@Override
	public Klasa1Model updateKlasa1(Long id, Klasa1Model klasa1) {
		Klasa1Model entitet = returnKlasa1(id);
		entitet.updateKlasa1(klasa1);
		return saveKlasa1(entitet);
	}

	@Override
	public void deleteKlasa1(Long id) {
		Klasa1Model entitet = returnKlasa1(id);
		if(entitet != null)
			klasa1Repository.delete(entitet);
	}

}
