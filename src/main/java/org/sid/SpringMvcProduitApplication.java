package org.sid;

import org.sid.entities.Produit;
import org.sid.repositories.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@Configuration
//@EnableJpaRepositories("com.frezgui.repositories")
@SpringBootApplication
@EntityScan("org.sid.entities")
public class SpringMvcProduitApplication implements CommandLineRunner {

	@org.springframework.beans.factory.annotation.Autowired
	private ProduitRepository pr;
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcProduitApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		pr.save(new Produit("lGhKM", 120.00));
		pr.save(new Produit("HNDTF", 20.00));
		pr.save(new Produit("GHETC", 10.00));
		pr.save(new Produit("NBZZH", 50.00));
		pr.save(new Produit("MPCBE", 33.55));
		pr.save(new Produit("QDSRT", 22.00));
		
	}
}
