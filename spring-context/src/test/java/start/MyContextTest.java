package start;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticMessageSource;
import start.bean.Product;
import start.bean.factorybean.Car;
import start.bean.factorybean.CarFactoryBean;

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

	//测试FactoryBean
	@Test
	public void FactoryBeanTest(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/start/simple-context.xml");
		//不加&返回的是getObject方法
		Car car = (Car) context.getBean("carFactoryBean");
		System.out.println(car.toString());
		//加&返回的是FactoryBean实现类
		CarFactoryBean carFactoryBean = (CarFactoryBean) context.getBean("&carFactoryBean");
		System.out.println(carFactoryBean.toString());
	}

}
