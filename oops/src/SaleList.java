
public class SaleList {
private String dtSale;
private String custName;
private Sale[] sales=new Sale[10];
private int saleNum;
public Sale[] getSales() {
	return sales;
}
public void setSales(Sale[] sales) {
	this.sales = sales;
}
public int getSaleNum() {
	return saleNum;
}
public void setSaleNum(int saleNum) {
	this.saleNum = saleNum;
}
public String getDtSale() {
	return dtSale;
}
public void setDtSale(String dtSale) {
	this.dtSale = dtSale;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public Sale[] getSale() {
	return sales;
}
public void setSale(Sale[] sales) {
	this.sales = sales;
}
public SaleList(String dtSale, String custName) {
	super();
	this.dtSale = dtSale;
	this.custName = custName;
	
}
public SaleList() {
	super();
}
public void add(Sale sale)
{sales[saleNum]=sale;
	saleNum++;

}
}
