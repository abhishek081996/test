

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan()
@SpringBootApplication
public class AbhibootdemoApplication implements CommandLineRunner {
	
//	@Autowired
//	bdi bdpio=new bdi(new Book(124l,"sf","sd"));
	@Autowired
	persondao dao;

		private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		ApplicationContext app = 
				SpringApplication.run(AbhibootdemoApplication.class, args);
		//for (String name : app.getBeanDefinitionNames()) {
		//	System.out.println(name);}

	 bdi bdttails=app.getBean(bdi.class,new Book(1354l, "Mastering Spring 5.2", "Ranga Karanam"));
	//working code //bdttails.setbdi(new Book(1354l, "Mastering Spring 5.2", "Ranga Karanam"));
	 
		 System.out.println(bdttails.details());
		 
//		 for (String name : app.getBeanDefinitionNames()) {
//				System.out.println(name);
//		 }
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(bdpio.details());
		System.out.println(bdpio.details());
		
	}

}
