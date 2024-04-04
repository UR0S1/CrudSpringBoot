package rs.co.skola;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import rs.co.skola.model.Klasa1Model;
import rs.co.skola.model.Klasa2Model;
import rs.co.skola.model.Klasa3Model;
import rs.co.skola.service.Klasa1Service;
import rs.co.skola.service.Klasa2Service;
import rs.co.skola.service.Klasa3Service;

@SpringBootApplication
public class TestPripremaApplication {//implements CommandLineRunner{
//	Klasa1Service klasa1Service;
//	Klasa2Service klasa2Service;
//	Klasa3Service klasa3Service;
//	public TestPripremaApplication(Klasa1Service klasa1Service, Klasa2Service klasa2Service,
//			Klasa3Service klasa3Service) {
//		super();
//		this.klasa1Service = klasa1Service;
//		this.klasa2Service = klasa2Service;
//		this.klasa3Service = klasa3Service;
//	}

	public static void main(String[] args) {
		SpringApplication.run(TestPripremaApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Klasa1Model klasa1 = new Klasa1Model(null,"Klasa1");
//		klasa1Service.saveKlasa1(klasa1);
//		Klasa2Model klasa2 = new Klasa2Model(null,"Klasa2");
//		klasa2Service.saveKlasa2(klasa2);
//		Klasa3Model klasa3 = new Klasa3Model(null,klasa1.getId(),klasa2.getId());
//		klasa3Service.saveKlasa3(klasa3);
//	}
	
	
}
