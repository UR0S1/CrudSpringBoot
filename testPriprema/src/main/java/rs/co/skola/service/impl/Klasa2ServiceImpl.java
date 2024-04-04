package rs.co.skola.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import rs.co.skola.model.Klasa2Model;
import rs.co.skola.repository.Klasa2Repository;
import rs.co.skola.service.Klasa2Service;

@Service
public class Klasa2ServiceImpl implements Klasa2Service{

	Klasa2Repository klasa2Repository;
	
	
	public Klasa2ServiceImpl(Klasa2Repository klasa2Repository) {
		super();
		this.klasa2Repository = klasa2Repository;
	}

	@Override
	public List<Klasa2Model> listaKlasa2() {
		return klasa2Repository.findAll();
	}

	@Override
	public Klasa2Model saveKlasa2(Klasa2Model klasa2) {
		return klasa2Repository.save(klasa2);
	}

	@Override
	public Klasa2Model returnKlasa2(Long id) {
		return klasa2Repository.findById(id).get();
	}

	@Override
	public Klasa2Model updateKlasa2(Long id, Klasa2Model klasa2) {
		Klasa2Model entitet = returnKlasa2(id);
		entitet.updateKlasa2(klasa2);
		return saveKlasa2(entitet);
	}

	@Override
	public void deleteKlasa2(Long id) {
		Klasa2Model entitet = returnKlasa2(id);
		if(entitet != null)
			klasa2Repository.delete(entitet);
	}

}
