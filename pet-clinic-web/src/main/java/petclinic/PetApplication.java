package petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan({"com.springpetclinic","petclinic"})
public class PetApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetApplication.class, args);
	}

}
