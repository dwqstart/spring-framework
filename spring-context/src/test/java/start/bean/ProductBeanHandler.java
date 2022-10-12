package start.bean;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class ProductBeanHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		// 将组件解析器进行注册到 `Spring` 容器
		registerBeanDefinitionParser("product", new ProductBeanDefinitionParser());
	}
}