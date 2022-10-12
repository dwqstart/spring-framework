package start;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticMessageSource;
import start.bean.Product;

public class MyContextTest {

	@Test
	public void simpleContext(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/start/simple-context.xml");
		StaticMessageSource source = (StaticMessageSource) context.getBean("staticMessageSource");
		System.out.println(source.toString());
	}

	//自定义标签测试
	@Test
	public void productTest(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/start/product-bean.xml");
		Product product = (Product) context.getBean("product");
		System.out.println(product.toString());
	}


}
