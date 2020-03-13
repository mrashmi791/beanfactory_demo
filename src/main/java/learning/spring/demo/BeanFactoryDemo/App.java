package learning.spring.demo.BeanFactoryDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    	 ApplicationContext context = new ClassPathXmlApplicationContext("application-Context.xml");
    
//       System.out.println( "Hello World!" );
    	
//    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//    	
    	Demo d1 = (Demo) context.getBean("demo");
    	System.out.println(d1.getName()+ " "+ d1.getAge());
    	d1.getAge();
//    	context.close();
    }
}
