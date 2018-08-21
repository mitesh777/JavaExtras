
public class BillingSys {
public double generateBill(SaleList list)
{double bill=0;
double temp=0;
double total=0;
StdTaxCalc tax=new StdTaxCalc();
	for(int i=0;i<list.getSaleNum();i++)
	{	temp=list.getSales()[i].getQty()*list.getSales()[i].getItem().getRate();
	bill+=temp-temp*list.getSales()[i].getDisc()/100;}
	total=bill*((tax.getFed()+tax.getIst())/100)+bill;
return total;
}
}
