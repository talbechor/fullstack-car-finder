package carfullStack.jb.carfullStack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarFullStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarFullStackApplication.class, args);
		System.out.println(Art.banner);
	}

}
