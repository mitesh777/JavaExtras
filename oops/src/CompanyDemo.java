
public class CompanyDemo {

	public static void main(String[] args) {
		Company company=new Company();
		Customer cust1=new Customer(1,"aaa");
		Customer cust2=new RegCustomer(1,"zzz",0.10);
		
		Customer cust3=new RegCustomer(3,"qqq",0.20);
		
		Customer cust4=new Customer(4,"bbb");
		company.addCustomer(cust4);
		company.addCustomer(cust3);
		company.addCustomer(cust2);
		company.addCustomer(cust1);
		
		Item item1=new Item("qqq",100.0);
		Item item2=new Item("yup",65.0);
		Item item3=new Item("ttq",390.0);
		Item item4=new Item("erq",1780.0);
		Item item5=new Item("ss",56.0);
OrderedItem oi1=new OrderedItem(10,item1);
OrderedItem oi2=new OrderedItem(5,item2);

Order o=new Order("10/11/2018");
o.addOrderedItem(oi1);
o.addOrderedItem(oi2);
cust1.addOrder(o);
Order o1=new Order("25/11/2018");

o1.addOrderedItem(oi2);
cust2.addOrder(o1);
System.out.print(company.getTotalWorthOfOrdersPlaced());
	}

}
