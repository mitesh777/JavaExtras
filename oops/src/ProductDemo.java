
public class ProductDemo {

	public static void main(String[] args) {
		Product p1=new Product("","","",120);
		Product p2=new Product("","","",20);
		Product p3=new Product("","","",30);
		Product p4=new Product("","","",100);
		Product p5=new Product("","","",10);
		System.out.println("number " + Product.getProductCount());
	}

}
