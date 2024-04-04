package rs.co.skola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rs.co.skola.model.Klasa2Model;
import rs.co.skola.service.Klasa2Service;

@Controller
@RequestMapping("/klasa2")
public class Klasa2Controller {
	Klasa2Service klasa2Service;
	
	public Klasa2Controller(Klasa2Service klasa2Service) {
		super();
		this.klasa2Service = klasa2Service;
	}

	@GetMapping(value = {"","/","listaKlasa2"})
	public String listaKlasa2(Model model) {
		model.addAttribute("listaKlasa2", klasa2Service.listaKlasa2());
		return "Klasa2/index.html";
	}
	
	@GetMapping("/addKlasa2")
	public String addKlasa2(Model model){
		Klasa2Model klasa2 = new Klasa2Model();
		model.addAttribute("klasa2Dto", klasa2);
		
		return "Klasa2/formAdd.html";
	}
	
	@PostMapping("/addKlasa2")
	public String addKlasa2(@ModelAttribute("klasa2Dto") Klasa2Model klasa2) {
		klasa2Service.saveKlasa2(klasa2);
		return "redirect:/klasa2";
	}
	
	@GetMapping("/deleteKlasa2/{idKlasa2}")
	public String deleteKlasa2(@PathVariable("idKlasa2") Long id) {
		try {
			klasa2Service.deleteKlasa2(id);			
		}catch(Exception e){
			return "errorBaza.html";
		}
		return "redirect:/klasa2";
	}
	
	@GetMapping("/editKlasa2/{idKlasa2}")
	public String editKlasa2(Model model, @PathVariable("idKlasa2") Long id) {
		Klasa2Model klasa2 = klasa2Service.returnKlasa2(id);
		model.addAttribute("klasa2Dto", klasa2);
		return "Klasa2/formEdit.html";
	}
	
	@PostMapping("/editKlasa2/{idKlasa2}")
	public String editKlasa2(@PathVariable("idKlasa2") Long id,
							 @ModelAttribute("klasa2Dto") Klasa2Model klasa2) {
		klasa2Service.updateKlasa2(id, klasa2);
		return "redirect:/klasa2";
	}
	
	
}
