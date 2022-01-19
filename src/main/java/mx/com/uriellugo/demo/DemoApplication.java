package mx.com.uriellugo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = (ApplicationContext) SpringApplication.run(DemoApplication.class, args);
		System.out.println("Nombre de la Aplicación: " + applicationContext.getApplicationName());
		System.out.println("Nombre: " + applicationContext.getDisplayName());
		//Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
		//System.out.println("Beans de la clase " + ClientService.class.getSimpleName() + ": " + applicationContext.getBeanNamesForType(ClientService.class));

		
		
	}

}