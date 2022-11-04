package start.circle;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleTest {


	//测试构造器注入循环依赖
	@Test
	public void CircleConstructorTest(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/start/circle/circle-constructor.xml");
		// 构造器注入循环依赖会抛以下异常
		// nested exception is org.springframework.beans.factory.BeanCurrentlyInCreationException:
		// Error creating bean with name 'circleA': Requested bean is currently in creation: Is there an unresolvable circular reference?
	}

	//测试setter注入循环依赖
	@Test
	public void CircleSetterTest(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/start/circle/circle-setter.xml");
		CircleA circleA = (CircleA) context.getBean("circleA");
		circleA.a();
		// setter注入循环依赖 spring是帮我们解决了的
	}
}
