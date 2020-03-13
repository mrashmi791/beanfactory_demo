package learning.spring.demo.BeanFactoryDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Demo demo() {
		Demo d = new Demo();
		d.setName("Ankit");
		d.setAge(25);
		return d;
		
	}
}
