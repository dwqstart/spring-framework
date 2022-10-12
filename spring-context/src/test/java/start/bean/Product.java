package start.bean;

public class Product {

	private Integer productId;

	private String unit;

	private String name;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productId=" + productId +
				", unit='" + unit + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}