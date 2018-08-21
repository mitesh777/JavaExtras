
public class Product {
private String code;
private String name;
private String description;
private double price;
private static int productCount;

public Product(String code, String name, String description, double price) {
	super();
	this.code = code;
	this.name = name;
	this.description = description;
	this.price = price;
	productCount++;
}

public static int getProductCount() {
	return productCount;
}

public void setProductCount(int productCount) {
	this.productCount = productCount;
}

}
