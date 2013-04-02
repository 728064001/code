import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.HelloService;


public class SpringTest extends TestCase {
	public void testioc(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService hello = (HelloService)ctx.getBean("helloserviceimple");
		System.out.println(hello.say());
	}
}
