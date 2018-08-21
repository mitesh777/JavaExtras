public class ResultFinder {
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}

	private int m1;
	private int m2;
	private int m3;
	
	// Create setter and getter methods 

	public void displayMarks() {

System.out.println("marks are" +m1+ " " +m2+" "+m3);
	
	}
	public int getTotal() {
return m1+m2+m3;
	}
	public double getAverage() {
	return (getTotal())/3; 
	}
	
	public String getResult() {
String str;
if(getAverage()>40)
	str="PASS";
else
	str="FAIL";
return str;
	}
}
