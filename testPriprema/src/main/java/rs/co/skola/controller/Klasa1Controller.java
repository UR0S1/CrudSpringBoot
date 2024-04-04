package rs.co.skola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rs.co.skola.model.Klasa1Model;
import rs.co.skola.service.Klasa1Service;

@Controller
@RequestMapping("/klasa1")
public class Klasa1Controller {
	Klasa1Service klasa1Service;
	
	public Klasa1Controller(Klasa1Service klasa1Service) {
		super();
		this.klasa1Service = klasa1Service;
	}

	@GetMapping(value = {"","/","listaKlasa1"})
	public String listaKlasa1(Model model) {
		model.addAttribute("listaKlasa1", klasa1Service.listaKlasa1());
		return "Klasa1/index.html";
	}
	
	@GetMapping("/addKlasa1")
	public String addKlasa1(Model model){
		Klasa1Model klasa1 = new Klasa1Model();
		model.addAttribute("klasa1Dto", klasa1);
		
		return "Klasa1/formAdd.html";
	}
	
	@PostMapping("/addKlasa1")
	public String addKlasa1(@ModelAttribute("klasa1Dto") Klasa1Model klasa1) {
		klasa1Service.saveKlasa1(klasa1);
		return "redirect:/klasa1";
	}
	
	@GetMapping("/deleteKlasa1/{idKlasa1}")
	public String deleteKlasa1(@PathVariable("idKlasa1") Long id) {
		try {
			klasa1Service.deleteKlasa1(id);			
		}catch(Exception e){
			return "errorBaza.html";
		}
		return "redirect:/klasa1";
	}
	
	@GetMapping("/editKlasa1/{idKlasa1}")
	public String editKlasa1(Model model, @PathVariable("idKlasa1") Long id) {
		Klasa1Model klasa1 = klasa1Service.returnKlasa1(id);
		model.addAttribute("klasa1Dto", klasa1);
		return "Klasa1/formEdit.html";
	}
	
	@PostMapping("/editKlasa1/{idKlasa1}")
	public String editKlasa1(@PathVariable("idKlasa1") Long id,
							 @ModelAttribute("klasa1Dto") Klasa1Model klasa1) {
		klasa1Service.updateKlasa1(id, klasa1);
		return "redirect:/klasa1";
	}
	
	
}
