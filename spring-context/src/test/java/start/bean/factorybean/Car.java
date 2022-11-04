package start.bean.factorybean;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class Car implements BeanPostProcessor {
	 private String brand;
	 private String price;
	 private String speed;


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				", price='" + price + '\'' +
				", speed='" + speed + '\'' +
				'}';
	}
}
