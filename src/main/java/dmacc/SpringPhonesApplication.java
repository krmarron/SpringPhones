package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Phone;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PhoneRepository;

@SpringBootApplication
public class SpringPhonesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPhonesApplication.class, args);
	}
	
	@Autowired
	PhoneRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Phone p = appContext.getBean("phone", Phone.class);
		p.setCarrier("T-Mobile");
		repo.save(p);
		
		//creating a bean to use - not managed by Spring
		Phone c = new Phone("Samsung", "Galaxy Fold", "AT&T");
		
		List<Phone> allMyPhones = repo.findAll();
		for(Phone phones: allMyPhones) {
			System.out.println(phones.toString());
		}
		((AbstractApplicationContext) appContext).close();		
	}

}
