package rs.co.skola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rs.co.skola.model.Klasa3Model;
import rs.co.skola.service.Klasa1Service;
import rs.co.skola.service.Klasa2Service;
import rs.co.skola.service.Klasa3Service;

@Controller
@RequestMapping("/klasa3")
public class Klasa3Controller {
	public Klasa3Controller(Klasa3Service klasa3Service, Klasa2Service klasa2Service, Klasa1Service klasa1Service) {
		super();
		this.klasa3Service = klasa3Service;
		this.klasa2Service = klasa2Service;
		this.klasa1Service = klasa1Service;
	}

	Klasa3Service klasa3Service;
	Klasa2Service klasa2Service;
	Klasa1Service klasa1Service;

	@GetMapping(value = {"","/","listaKlasa3"})
	public String listaKlasa3(Model model) {
		model.addAttribute("listaKlasa3", klasa3Service.listaKlasa3());
		return "Klasa3/index.html";
	}
	
	@GetMapping("/addKlasa3")
	public String addKlasa3(Model model){
		Klasa3Model klasa3 = new Klasa3Model();
		model.addAttribute("klasa3Dto", klasa3);
		model.addAttribute("listaKlasa2", klasa2Service.listaKlasa2());
		model.addAttribute("listaKlasa1", klasa1Service.listaKlasa1());
		return "Klasa3/formAdd.html";
	}
	
	@PostMapping("/addKlasa3")
	public String addKlasa3(@ModelAttribute("klasa3Dto") Klasa3Model klasa3) {
		klasa3Service.saveKlasa3(klasa3);
		return "redirect:/klasa3";
	}
	
	@GetMapping("/deleteKlasa3/{idKlasa3}")
	public String deleteKlasa3(@PathVariable("idKlasa3") Long id) {
		try {
			klasa3Service.deleteKlasa3(id);			
		}catch(Exception e){
			return "errorBaza.html";
		}
		return "redirect:/klasa3";
	}
	
	@GetMapping("/editKlasa3/{idKlasa3}")
	public String editKlasa3(Model model, @PathVariable("idKlasa3") Long id) {
		Klasa3Model klasa3 = klasa3Service.returnKlasa3(id);
		model.addAttribute("klasa3Dto", klasa3);
		model.addAttribute("listaKlasa2", klasa2Service.listaKlasa2());
		model.addAttribute("listaKlasa1", klasa1Service.listaKlasa1());
		return "Klasa3/formEdit.html";
	}
	
	@PostMapping("/editKlasa3/{idKlasa3}")
	public String editKlasa3(@PathVariable("idKlasa3") Long id,
							 @ModelAttribute("klasa3Dto") Klasa3Model klasa3) {
		klasa3Service.updateKlasa3(id, klasa3);
		return "redirect:/klasa3";
	}
	
	
}
