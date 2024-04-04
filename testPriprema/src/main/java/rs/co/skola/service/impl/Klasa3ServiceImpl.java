package rs.co.skola.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import rs.co.skola.model.Klasa3Model;
import rs.co.skola.repository.Klasa3Repository;
import rs.co.skola.service.Klasa3Service;

@Service
public class Klasa3ServiceImpl implements Klasa3Service{

	Klasa3Repository klasa3Repository;
	
	
	public Klasa3ServiceImpl(Klasa3Repository klasa3Repository) {
		super();
		this.klasa3Repository = klasa3Repository;
	}

	@Override
	public List<Klasa3Model> listaKlasa3() {
		return klasa3Repository.findAll();
	}

	@Override
	public Klasa3Model saveKlasa3(Klasa3Model klasa3) {
		return klasa3Repository.save(klasa3);
	}

	@Override
	public Klasa3Model returnKlasa3(Long id) {
		return klasa3Repository.findById(id).get();
	}

	@Override
	public Klasa3Model updateKlasa3(Long id, Klasa3Model klasa3) {
		Klasa3Model entitet = returnKlasa3(id);
		entitet.updateKlasa3(klasa3);
		return saveKlasa3(entitet);
	}

	@Override
	public void deleteKlasa3(Long id) {
		Klasa3Model entitet = returnKlasa3(id);
		if(entitet != null)
			klasa3Repository.delete(entitet);
	}

}
