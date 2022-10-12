package start;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticMessageSource;

public class MyContextTest {

	@Test
	public void simpleContext(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/start/simple-context.xml");
		StaticMessageSource source = (StaticMessageSource) context.getBean("staticMessageSource");
		System.out.println(source.toString());
	}
}
