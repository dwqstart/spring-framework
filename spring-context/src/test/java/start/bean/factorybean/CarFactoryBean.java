package start.bean.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {
	private String carInfo;

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		String[] split = carInfo.split(",");
		car.setBrand(split[0]);
		car.setPrice(split[1]);
		car.setSpeed(split[2]);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
}
