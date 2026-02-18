package in.n4smh.microservices.person.parent_webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "in.n4smh.microservices.person")
public class PersonParentWebMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonParentWebMvcApplication.class, args);
	}

}
