package bootapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class HelloWorldController {

	private String saludo = "Hello World!!";

	//1.1
	private String version = "1.3";

	@GetMapping("/getSaludo")
	public String getSaludo() {
		return saludo;
	}
	
	//1.1
	@GetMapping("/getVersion")
	public String getVersion() {
		return version;
	}

	//1.2
	@GetMapping("/setSaludo")
	public String setSaludo(String newSaludo) {
		saludo = newSaludo; // se le debe dar persistencia a saludo
		return saludo;
	}

	//1.3
	@GetMapping("/getQuienSoy")
	public String getQuienSoy(String address) {
		//myAddress = address; // se le debe dar persistencia a myAddress (JWT)
		return address;
	}

}